package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.ProductElement;
import fr.hattane.ilias.rtt.cpcc.entity.products.ProductElementId;
import fr.hattane.ilias.rtt.cpcc.repository.products.ProductElementRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product-elements")
public class ProductElementController {
    private final ProductElementRepository repository;

    public ProductElementController(ProductElementRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<ProductElement> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{productId}/{elementId}")
    public ResponseEntity<ProductElement> findById(@PathVariable("productId") Long productId,
                                                   @PathVariable("elementId") Long elementId) {
        return repository.findById(new ProductElementId(productId, elementId))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductElement create(@RequestBody ProductElement entity) {
        return repository.save(entity);
    }

    @PutMapping("/{productId}/{elementId}")
    public ProductElement update(@PathVariable("productId") Long productId,
                                 @PathVariable("elementId") Long elementId,
                                 @RequestBody ProductElement entity) {
        return repository.save(entity);
    }

    @DeleteMapping("/{productId}/{elementId}")
    public void delete(@PathVariable("productId") Long productId,
                       @PathVariable("elementId") Long elementId) {
        repository.deleteById(new ProductElementId(productId, elementId));
    }
}
