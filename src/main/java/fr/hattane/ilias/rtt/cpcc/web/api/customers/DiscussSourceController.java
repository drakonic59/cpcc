package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.DiscussSource;
import fr.hattane.ilias.rtt.cpcc.repository.customers.DiscussSourceRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discuss-sources")
public class DiscussSourceController extends AbstractCrudRestController<DiscussSource, Long> {
    public DiscussSourceController(DiscussSourceRepository repository) {
        super(repository);
    }
}
