package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.PackageRepository;

@Service
public class PackageService {
    private final PackageRepository repository;

    public PackageService(PackageRepository repository) {
        this.repository = repository;
    }

    public PackageRepository getRepository() {
        return repository;
    }
}

