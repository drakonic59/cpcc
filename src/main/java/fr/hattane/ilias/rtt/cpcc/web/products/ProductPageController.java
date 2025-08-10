package fr.hattane.ilias.rtt.cpcc.web.products;

import java.io.IOException;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import fr.hattane.ilias.rtt.cpcc.service.FileService;
import fr.hattane.ilias.rtt.cpcc.service.products.ProductCategoryService;
import fr.hattane.ilias.rtt.cpcc.service.products.ProductService;

@Controller
@RequestMapping("/products")
public class ProductPageController {
	
    private final ProductService service;
    private final ProductCategoryService categories;
    private final FileService files;

    public ProductPageController(ProductService service, ProductCategoryService categories, FileService files) {
        this.service = service;
        this.categories = categories;
        this.files = files;
    }

    private static final java.util.List<String> FIELDS = java.util.List.of(
            "id", "name", "sellPrice", "productionPrice", "createdAt"
    );

    @GetMapping
    public String hub(Model model) {
        model.addAttribute("page", "products");
        model.addAttribute("products", service.getRepository().findAll());
        model.addAttribute("categories", categories.getRepository().findAll());
        return "products/index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("items", service.getRepository().findAll());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "products");
        return "products/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("item", new Product());
        model.addAttribute("categories", categories.getRepository().findAll());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "products");
        return "products/form";
    }

    @GetMapping("/new-version/{id}")
    public String add(Model model, @PathVariable Long id) {
    	
    	Product p = service.getRepository().findById(id).get();
    	Product product = new Product();
    	product.setName(p.getName());
    	product.setDescription(p.getDescription());
    	product.setDeep(p.getDeep());
    	product.setHeight(p.getHeight());
    	product.setWidth(p.getWidth());
    	product.setProductVersion(Double.valueOf(p.getProductVersion().doubleValue() +0.1));
    	product.setCategory(p.getCategory());
    	product.setCreatedBy(p.getCreatedBy());
    	product.setEnabled(Boolean.FALSE);
    	product.setExternalLink(p.getExternalLink());
    	product.setPound(p.getPound());
    	product.setImage(p.getImage());
    	product.setProductionPrice(p.getProductionPrice());
    	product.setSellPrice(p.getSellPrice());
    	
        model.addAttribute("item", product);
        model.addAttribute("categories", categories.getRepository().findAll());
        model.addAttribute("page", "products");
        
        return "products/form";
    }

    @GetMapping("/show/{id}")
    public String show(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getRepository().findById(id).orElseThrow());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "products");
        return "products/show";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getRepository().findById(id).orElseThrow());
        model.addAttribute("categories", categories.getRepository().findAll());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "products");
        return "products/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, @RequestParam MultipartFile img) throws IOException {

    	System.out.println(img.getOriginalFilename());
    	String[] filename = img.getOriginalFilename().split("\\.");
    	FileEntity image = files.getRepository().save(new FileEntity(filename[0], "." + filename[1], img.getBytes()));
    	
		product.setCreatedAt(LocalDateTime.now());
        product.setImage(image);
		service.getRepository().save(product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.getRepository().deleteById(id);
        return "redirect:/products/list";
    }
}
