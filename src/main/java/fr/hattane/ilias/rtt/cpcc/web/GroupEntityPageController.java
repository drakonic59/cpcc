package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.customers.GroupEntity;
import fr.hattane.ilias.rtt.cpcc.service.GroupService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groupentitys")
public class GroupEntityPageController extends AbstractCrudPageController<GroupEntity, Long> {
    public GroupEntityPageController(GroupService service) {
        super(service.getRepository(), GroupEntity.class, "groupentitys");
    }
}
