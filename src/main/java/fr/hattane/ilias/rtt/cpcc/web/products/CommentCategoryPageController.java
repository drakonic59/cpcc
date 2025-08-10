package fr.hattane.ilias.rtt.cpcc.web.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.CommentCategory;
import fr.hattane.ilias.rtt.cpcc.service.products.CommentCategoryService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commentcategories")
public class CommentCategoryPageController extends AbstractCrudPageController<CommentCategory, Long> {
    public CommentCategoryPageController(CommentCategoryService service) {
        super(service.getRepository(), CommentCategory.class, "commentcategories");
    }
}
