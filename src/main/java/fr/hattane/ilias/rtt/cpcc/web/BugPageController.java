package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Bug;
import fr.hattane.ilias.rtt.cpcc.service.BugService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bugs")
public class BugPageController extends AbstractCrudPageController<Bug, Long> {
    public BugPageController(BugService service) {
        super(service.getRepository(), Bug.class, "bugs");
    }
}
