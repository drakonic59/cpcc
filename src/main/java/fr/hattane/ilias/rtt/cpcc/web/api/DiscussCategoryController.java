package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.DiscussCategory;
import fr.hattane.ilias.rtt.cpcc.repository.DiscussCategoryRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discuss-categorys")
public class DiscussCategoryController extends AbstractCrudRestController<DiscussCategory, Long> {
    public DiscussCategoryController(DiscussCategoryRepository repository) {
        super(repository);
    }
}
