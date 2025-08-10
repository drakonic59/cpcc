package fr.hattane.ilias.rtt.cpcc.web.api.products;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hattane.ilias.rtt.cpcc.entity.products.Competition;
import fr.hattane.ilias.rtt.cpcc.repository.products.CompetitionRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

@RestController
@RequestMapping("/api/competitions")
public class CompetitionController extends AbstractCrudRestController<Competition, Long> {
    public CompetitionController(CompetitionRepository repository) {
        super(repository);
    }
}
