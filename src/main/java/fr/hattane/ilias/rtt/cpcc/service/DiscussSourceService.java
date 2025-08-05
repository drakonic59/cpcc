package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.DiscussSourceRepository;
import org.springframework.stereotype.Service;

@Service
public class DiscussSourceService {
    private final DiscussSourceRepository repository;

    public DiscussSourceService(DiscussSourceRepository repository) {
        this.repository = repository;
    }

    public DiscussSourceRepository getRepository() {
        return repository;
    }
}

