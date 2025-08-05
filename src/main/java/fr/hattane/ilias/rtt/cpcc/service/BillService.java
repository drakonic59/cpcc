package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.BillRepository;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    private final BillRepository repository;

    public BillService(BillRepository repository) {
        this.repository = repository;
    }

    public BillRepository getRepository() {
        return repository;
    }
}

