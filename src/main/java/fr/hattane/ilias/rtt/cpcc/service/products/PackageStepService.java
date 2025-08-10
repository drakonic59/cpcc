package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.PackageStepRepository;

@Service
public class PackageStepService {
    private final PackageStepRepository repository;

    public PackageStepService(PackageStepRepository repository) {
        this.repository = repository;
    }

    public PackageStepRepository getRepository() {
        return repository;
    }
}

