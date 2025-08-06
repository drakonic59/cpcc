package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import fr.hattane.ilias.rtt.cpcc.repository.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController extends AbstractCrudRestController<Product, Long> {
    public ProductController(ProductRepository repository) {
        super(repository);
    }
}
