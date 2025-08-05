package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.Step;
import fr.hattane.ilias.rtt.cpcc.repository.StepRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/steps")
public class StepController extends AbstractCrudRestController<Step, Long> {
    public StepController(StepRepository repository) {
        super(repository);
    }
}
