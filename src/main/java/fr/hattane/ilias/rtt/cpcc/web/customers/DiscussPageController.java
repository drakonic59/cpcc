package fr.hattane.ilias.rtt.cpcc.web.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Discuss;
import fr.hattane.ilias.rtt.cpcc.service.customers.DiscussService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/discusss")
public class DiscussPageController extends AbstractCrudPageController<Discuss, Long> {
    public DiscussPageController(DiscussService service) {
        super(service.getRepository(), Discuss.class, "discusss");
    }
}
