package fr.hattane.ilias.rtt.cpcc.service.finance;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.finance.BillRepository;

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

