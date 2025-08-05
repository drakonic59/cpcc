package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.GroupEntity;
import fr.hattane.ilias.rtt.cpcc.repository.GroupEntityRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/group-entitys")
public class GroupEntityController extends AbstractCrudRestController<GroupEntity, Long> {
    public GroupEntityController(GroupEntityRepository repository) {
        super(repository);
    }
}
