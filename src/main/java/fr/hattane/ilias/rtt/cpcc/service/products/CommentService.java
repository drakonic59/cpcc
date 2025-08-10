package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.CommentRepository;

@Service
public class CommentService {
    private final CommentRepository repository;

    public CommentService(CommentRepository repository) {
        this.repository = repository;
    }

    public CommentRepository getRepository() {
        return repository;
    }
}

