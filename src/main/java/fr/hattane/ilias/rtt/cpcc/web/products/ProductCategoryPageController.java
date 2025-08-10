package fr.hattane.ilias.rtt.cpcc.web.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.hattane.ilias.rtt.cpcc.entity.products.ProductCategory;
import fr.hattane.ilias.rtt.cpcc.service.products.ProductCategoryService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

@Controller
@RequestMapping("/productcategories")
public class ProductCategoryPageController extends AbstractCrudPageController<ProductCategory, Long> {
    public ProductCategoryPageController(ProductCategoryService service) {
        super(service.getRepository(), ProductCategory.class, "productcategories");
    }
}
