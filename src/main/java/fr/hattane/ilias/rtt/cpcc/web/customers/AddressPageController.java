package fr.hattane.ilias.rtt.cpcc.web.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Address;
import fr.hattane.ilias.rtt.cpcc.service.customers.AddressService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addresss")
public class AddressPageController extends AbstractCrudPageController<Address, Long> {
    public AddressPageController(AddressService service) {
        super(service.getRepository(), Address.class, "addresss");
    }
}
