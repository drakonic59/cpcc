package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.StepRepository;
import org.springframework.stereotype.Service;

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

