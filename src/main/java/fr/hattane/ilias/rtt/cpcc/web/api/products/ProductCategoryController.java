package fr.hattane.ilias.rtt.cpcc.web.api.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hattane.ilias.rtt.cpcc.entity.products.ProductCategory;
import fr.hattane.ilias.rtt.cpcc.repository.products.ProductCategoryRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

@RestController
@RequestMapping("/api/product-categories")
public class ProductCategoryController extends AbstractCrudRestController<ProductCategory, Long> {
    public ProductCategoryController(ProductCategoryRepository repository) {
        super(repository);
    }
}
