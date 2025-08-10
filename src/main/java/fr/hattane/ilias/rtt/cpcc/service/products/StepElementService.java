package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.StepElementRepository;

@Service
public class StepElementService {
    private final StepElementRepository repository;

    public StepElementService(StepElementRepository repository) {
        this.repository = repository;
    }

    public StepElementRepository getRepository() {
        return repository;
    }
}

