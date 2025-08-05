package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.UnitRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitService {
    private final UnitRepository repository;

    public UnitService(UnitRepository repository) {
        this.repository = repository;
    }

    public UnitRepository getRepository() {
        return repository;
    }
}

