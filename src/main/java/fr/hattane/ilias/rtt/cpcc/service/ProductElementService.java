package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.ProductElementRepository;
import org.springframework.stereotype.Service;

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

