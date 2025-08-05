package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.PackageStepRepository;
import org.springframework.stereotype.Service;

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

