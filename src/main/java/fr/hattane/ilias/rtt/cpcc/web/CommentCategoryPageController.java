package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.products.CommentCategory;
import fr.hattane.ilias.rtt.cpcc.service.CommentCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commentcategorys")
public class CommentCategoryPageController extends AbstractCrudPageController<CommentCategory, Long> {
    public CommentCategoryPageController(CommentCategoryService service) {
        super(service.getRepository(), CommentCategory.class, "commentcategorys");
    }
}
