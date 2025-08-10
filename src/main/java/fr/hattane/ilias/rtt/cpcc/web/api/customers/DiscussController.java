package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Discuss;
import fr.hattane.ilias.rtt.cpcc.repository.customers.DiscussRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discusss")
public class DiscussController extends AbstractCrudRestController<Discuss, Long> {
    public DiscussController(DiscussRepository repository) {
        super(repository);
    }
}
