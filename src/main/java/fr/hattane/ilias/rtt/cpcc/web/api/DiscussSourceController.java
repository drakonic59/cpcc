package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.DiscussSource;
import fr.hattane.ilias.rtt.cpcc.repository.DiscussSourceRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discuss-sources")
public class DiscussSourceController extends AbstractCrudRestController<DiscussSource, Long> {
    public DiscussSourceController(DiscussSourceRepository repository) {
        super(repository);
    }
}
