package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserRepository getRepository() {
        return repository;
    }
}

