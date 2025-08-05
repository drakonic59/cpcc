package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.Comment;
import fr.hattane.ilias.rtt.cpcc.repository.CommentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
public class CommentController extends AbstractCrudRestController<Comment, Long> {
    public CommentController(CommentRepository repository) {
        super(repository);
    }
}
