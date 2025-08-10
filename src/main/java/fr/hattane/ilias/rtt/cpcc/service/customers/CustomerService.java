package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.CustomerRepository;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerRepository getRepository() {
        return repository;
    }
}
