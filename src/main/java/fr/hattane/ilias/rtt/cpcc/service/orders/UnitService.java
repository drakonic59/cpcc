package fr.hattane.ilias.rtt.cpcc.service.orders;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.orders.UnitRepository;

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

