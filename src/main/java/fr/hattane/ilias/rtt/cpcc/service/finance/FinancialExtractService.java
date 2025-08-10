package fr.hattane.ilias.rtt.cpcc.service.finance;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.finance.FinancialExtractRepository;

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
