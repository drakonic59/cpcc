package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.products.Step;
import fr.hattane.ilias.rtt.cpcc.service.StepService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepPageController extends AbstractCrudPageController<Step, Long> {
    public StepPageController(StepService service) {
        super(service.getRepository(), Step.class, "steps");
    }
}
