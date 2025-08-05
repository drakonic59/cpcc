package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Discuss;
import fr.hattane.ilias.rtt.cpcc.service.DiscussService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/discusss")
public class DiscussPageController extends AbstractCrudPageController<Discuss, Long> {
    public DiscussPageController(DiscussService service) {
        super(service.getRepository(), Discuss.class, "discusss");
    }
}
