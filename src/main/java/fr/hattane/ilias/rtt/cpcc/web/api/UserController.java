package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.User;
import fr.hattane.ilias.rtt.cpcc.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController extends AbstractCrudRestController<User, Long> {
    public UserController(UserRepository repository) {
        super(repository);
    }
}
