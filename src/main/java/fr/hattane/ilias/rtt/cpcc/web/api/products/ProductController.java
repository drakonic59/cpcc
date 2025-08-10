package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import fr.hattane.ilias.rtt.cpcc.repository.products.ProductRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController extends AbstractCrudRestController<Product, Long> {
    public ProductController(ProductRepository repository) {
        super(repository);
    }
}
