package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.PackageRepository;
import org.springframework.stereotype.Service;

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

