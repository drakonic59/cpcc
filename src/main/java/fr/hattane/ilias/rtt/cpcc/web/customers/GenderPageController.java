package fr.hattane.ilias.rtt.cpcc.web.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Gender;
import fr.hattane.ilias.rtt.cpcc.service.customers.GenderService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/genders")
public class GenderPageController extends AbstractCrudPageController<Gender, Long> {
    public GenderPageController(GenderService service) {
        super(service.getRepository(), Gender.class, "genders");
    }
}
