package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.ElementRepository;

@Service
public class ElementService {
    private final ElementRepository repository;

    public ElementService(ElementRepository repository) {
        this.repository = repository;
    }

    public ElementRepository getRepository() {
        return repository;
    }
}

