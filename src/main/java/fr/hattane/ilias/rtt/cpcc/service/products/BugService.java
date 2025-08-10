package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.BugRepository;

@Service
public class BugService {
    private final BugRepository repository;

    public BugService(BugRepository repository) {
        this.repository = repository;
    }

    public BugRepository getRepository() {
        return repository;
    }
}

