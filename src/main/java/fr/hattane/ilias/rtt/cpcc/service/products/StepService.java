package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.StepRepository;

@Service
public class StepService {
    private final StepRepository repository;

    public StepService(StepRepository repository) {
        this.repository = repository;
    }

    public StepRepository getRepository() {
        return repository;
    }
}

