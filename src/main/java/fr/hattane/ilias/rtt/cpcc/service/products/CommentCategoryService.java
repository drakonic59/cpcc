package fr.hattane.ilias.rtt.cpcc.service.products;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.products.CommentCategoryRepository;

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

