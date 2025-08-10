package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.CompetitionRepository;

@Service
public class CompetitionService {
    private final CompetitionRepository repository;

    public CompetitionService(CompetitionRepository repository) {
        this.repository = repository;
    }

    public CompetitionRepository getRepository() {
        return repository;
    }
}

