package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.ProductElementRepository;

@Service
public class ProductElementService {
    private final ProductElementRepository repository;

    public ProductElementService(ProductElementRepository repository) {
        this.repository = repository;
    }

    public ProductElementRepository getRepository() {
        return repository;
    }
}

