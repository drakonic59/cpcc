package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.CommentCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentCategoryService {
    private final CommentCategoryRepository repository;

    public CommentCategoryService(CommentCategoryRepository repository) {
        this.repository = repository;
    }

    public CommentCategoryRepository getRepository() {
        return repository;
    }
}

