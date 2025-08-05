package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.CommentCategory;
import fr.hattane.ilias.rtt.cpcc.repository.CommentCategoryRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment-categorys")
public class CommentCategoryController extends AbstractCrudRestController<CommentCategory, Long> {
    public CommentCategoryController(CommentCategoryRepository repository) {
        super(repository);
    }
}
