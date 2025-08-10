package fr.hattane.ilias.rtt.cpcc.web.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Comment;
import fr.hattane.ilias.rtt.cpcc.service.products.CommentService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class CommentPageController extends AbstractCrudPageController<Comment, Long> {
    public CommentPageController(CommentService service) {
        super(service.getRepository(), Comment.class, "comments");
    }
}
