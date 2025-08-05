package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.DiscussRepository;
import org.springframework.stereotype.Service;

@Service
public class DiscussService {
    private final DiscussRepository repository;

    public DiscussService(DiscussRepository repository) {
        this.repository = repository;
    }

    public DiscussRepository getRepository() {
        return repository;
    }
}

