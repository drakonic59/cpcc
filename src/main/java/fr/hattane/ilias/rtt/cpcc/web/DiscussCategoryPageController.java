package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.DiscussCategory;
import fr.hattane.ilias.rtt.cpcc.service.DiscussCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/discusscategorys")
public class DiscussCategoryPageController extends AbstractCrudPageController<DiscussCategory, Long> {
    public DiscussCategoryPageController(DiscussCategoryService service) {
        super(service.getRepository(), DiscussCategory.class, "discusscategorys");
    }
}
