package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.DiscussCategory;
import fr.hattane.ilias.rtt.cpcc.repository.customers.DiscussCategoryRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discuss-categorys")
public class DiscussCategoryController extends AbstractCrudRestController<DiscussCategory, Long> {
    public DiscussCategoryController(DiscussCategoryRepository repository) {
        super(repository);
    }
}
