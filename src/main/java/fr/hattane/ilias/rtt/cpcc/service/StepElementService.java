package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.StepElementRepository;
import org.springframework.stereotype.Service;

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

