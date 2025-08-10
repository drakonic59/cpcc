package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Step;
import fr.hattane.ilias.rtt.cpcc.repository.products.StepRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/steps")
public class StepController extends AbstractCrudRestController<Step, Long> {
    public StepController(StepRepository repository) {
        super(repository);
    }
}
