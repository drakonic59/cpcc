package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Discuss;
import fr.hattane.ilias.rtt.cpcc.repository.DiscussRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discusss")
public class DiscussController extends AbstractCrudRestController<Discuss, Long> {
    public DiscussController(DiscussRepository repository) {
        super(repository);
    }
}
