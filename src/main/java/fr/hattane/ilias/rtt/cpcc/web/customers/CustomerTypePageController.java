package fr.hattane.ilias.rtt.cpcc.web.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.CustomerType;
import fr.hattane.ilias.rtt.cpcc.service.customers.CustomerTypeService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customertypes")
public class CustomerTypePageController extends AbstractCrudPageController<CustomerType, Long> {
    public CustomerTypePageController(CustomerTypeService service) {
        super(service.getRepository(), CustomerType.class, "customertypes");
    }
}
