package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.CustomerType;
import fr.hattane.ilias.rtt.cpcc.service.CustomerTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customertypes")
public class CustomerTypePageController extends AbstractCrudPageController<CustomerType, Long> {
    public CustomerTypePageController(CustomerTypeService service) {
        super(service.getRepository(), CustomerType.class, "customertypes");
    }
}
