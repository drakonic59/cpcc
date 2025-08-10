package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.CustomerTypeRepository;

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

