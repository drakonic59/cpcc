package fr.hattane.ilias.rtt.cpcc.web.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.DiscussCategory;
import fr.hattane.ilias.rtt.cpcc.service.customers.DiscussCategoryService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/discusscategorys")
public class DiscussCategoryPageController extends AbstractCrudPageController<DiscussCategory, Long> {
    public DiscussCategoryPageController(DiscussCategoryService service) {
        super(service.getRepository(), DiscussCategory.class, "discusscategorys");
    }
}
