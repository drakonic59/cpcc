package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.ElementRepository;
import org.springframework.stereotype.Service;

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

