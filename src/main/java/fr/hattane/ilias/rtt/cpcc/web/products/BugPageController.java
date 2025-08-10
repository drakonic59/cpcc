package fr.hattane.ilias.rtt.cpcc.web.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Bug;
import fr.hattane.ilias.rtt.cpcc.service.products.BugService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bugs")
public class BugPageController extends AbstractCrudPageController<Bug, Long> {
    public BugPageController(BugService service) {
        super(service.getRepository(), Bug.class, "bugs");
    }
}
