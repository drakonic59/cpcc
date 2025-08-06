package fr.hattane.ilias.rtt.cpcc.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hattane.ilias.rtt.cpcc.entity.customers.GroupEntity;
import fr.hattane.ilias.rtt.cpcc.repository.GroupRepository;

@RestController
@RequestMapping("/api/groups")
public class GroupController extends AbstractCrudRestController<GroupEntity, Long> {
    public GroupController(GroupRepository repository) {
        super(repository);
    }
}
