package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.DiscussRepository;

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

