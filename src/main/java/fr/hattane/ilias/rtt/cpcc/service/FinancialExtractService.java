package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.FinancialExtractRepository;
import org.springframework.stereotype.Service;

@Service
public class FinancialExtractService {
    private final FinancialExtractRepository repository;

    public FinancialExtractService(FinancialExtractRepository repository) {
        this.repository = repository;
    }

    public FinancialExtractRepository getRepository() {
        return repository;
    }
}
