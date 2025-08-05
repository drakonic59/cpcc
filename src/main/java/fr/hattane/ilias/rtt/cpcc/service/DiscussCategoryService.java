package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.DiscussCategoryRepository;
import org.springframework.stereotype.Service;

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

