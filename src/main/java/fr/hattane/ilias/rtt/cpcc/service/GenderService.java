package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.GenderRepository;
import org.springframework.stereotype.Service;

@Service
public class GenderService {
    private final GenderRepository repository;

    public GenderService(GenderRepository repository) {
        this.repository = repository;
    }

    public GenderRepository getRepository() {
        return repository;
    }
}

