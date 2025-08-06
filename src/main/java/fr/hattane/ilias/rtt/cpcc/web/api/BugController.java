package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.products.Bug;
import fr.hattane.ilias.rtt.cpcc.repository.BugRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bugs")
public class BugController extends AbstractCrudRestController<Bug, Long> {
    public BugController(BugRepository repository) {
        super(repository);
    }
}
