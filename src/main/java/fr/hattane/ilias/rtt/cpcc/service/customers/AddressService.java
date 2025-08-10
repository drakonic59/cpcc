package fr.hattane.ilias.rtt.cpcc.service.customers;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.customers.AddressRepository;

@Service
public class AddressService {
    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    public AddressRepository getRepository() {
        return repository;
    }
}

