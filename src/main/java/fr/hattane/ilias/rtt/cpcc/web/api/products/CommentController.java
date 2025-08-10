package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Comment;
import fr.hattane.ilias.rtt.cpcc.repository.products.CommentRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
public class CommentController extends AbstractCrudRestController<Comment, Long> {
    public CommentController(CommentRepository repository) {
        super(repository);
    }
}
