package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import fr.hattane.ilias.rtt.cpcc.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductPageController {
    private final ProductService service;

    public ProductPageController(ProductService service) {
        this.service = service;
    }

    private static final java.util.List<String> FIELDS = java.util.List.of(
            "id", "name", "sellPrice", "productionPrice", "createdAt"
    );

    @GetMapping
    public String hub(Model model) {
        model.addAttribute("page", "products");
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
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "products");
        return "products/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getRepository().findById(id).orElseThrow());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "products");
        return "products/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product) {
        service.getRepository().save(product);
        return "redirect:/products/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.getRepository().deleteById(id);
        return "redirect:/products/list";
    }
}
