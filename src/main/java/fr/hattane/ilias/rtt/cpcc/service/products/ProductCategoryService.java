package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.ProductCategoryRepository;

@Service
public class ProductCategoryService {
    private final ProductCategoryRepository repository;

    public ProductCategoryService(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    public ProductCategoryRepository getRepository() {
        return repository;
    }
}

