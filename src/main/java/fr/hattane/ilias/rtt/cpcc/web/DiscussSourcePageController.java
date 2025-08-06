package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.customers.DiscussSource;
import fr.hattane.ilias.rtt.cpcc.service.DiscussSourceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/discusssources")
public class DiscussSourcePageController extends AbstractCrudPageController<DiscussSource, Long> {
    public DiscussSourcePageController(DiscussSourceService service) {
        super(service.getRepository(), DiscussSource.class, "discusssources");
    }
}
