package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.DiscussSourceRepository;

@Service
public class DiscussSourceService {
    private final DiscussSourceRepository repository;

    public DiscussSourceService(DiscussSourceRepository repository) {
        this.repository = repository;
    }

    public DiscussSourceRepository getRepository() {
        return repository;
    }
}

