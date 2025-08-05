package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.CustomerTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerTypeService {
    private final CustomerTypeRepository repository;

    public CustomerTypeService(CustomerTypeRepository repository) {
        this.repository = repository;
    }

    public CustomerTypeRepository getRepository() {
        return repository;
    }
}

