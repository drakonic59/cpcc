package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.CommentCategory;
import fr.hattane.ilias.rtt.cpcc.repository.products.CommentCategoryRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment-categorys")
public class CommentCategoryController extends AbstractCrudRestController<CommentCategory, Long> {
    public CommentCategoryController(CommentCategoryRepository repository) {
        super(repository);
    }
}
