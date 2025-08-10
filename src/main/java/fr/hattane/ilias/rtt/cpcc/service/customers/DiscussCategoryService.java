package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.DiscussCategoryRepository;

@Service
public class DiscussCategoryService {
    private final DiscussCategoryRepository repository;

    public DiscussCategoryService(DiscussCategoryRepository repository) {
        this.repository = repository;
    }

    public DiscussCategoryRepository getRepository() {
        return repository;
    }
}

