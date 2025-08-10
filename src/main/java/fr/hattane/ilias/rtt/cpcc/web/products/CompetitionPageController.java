package fr.hattane.ilias.rtt.cpcc.web.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.hattane.ilias.rtt.cpcc.entity.products.Competition;
import fr.hattane.ilias.rtt.cpcc.entity.products.ProductCategory;
import fr.hattane.ilias.rtt.cpcc.service.products.CompetitionService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

@Controller
@RequestMapping("/competitions")
public class CompetitionPageController extends AbstractCrudPageController<Competition, Long> {
    public CompetitionPageController(CompetitionService service) {
        super(service.getRepository(), Competition.class, "competitions");
    }
}
