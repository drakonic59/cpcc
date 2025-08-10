package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.GenderRepository;

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

