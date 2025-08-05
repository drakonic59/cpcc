package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.User;
import fr.hattane.ilias.rtt.cpcc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserPageController extends AbstractCrudPageController<User, Long> {
    public UserPageController(UserService service) {
        super(service.getRepository(), User.class, "users");
    }
}
