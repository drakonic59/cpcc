package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.BugRepository;
import org.springframework.stereotype.Service;

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

