package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Address;
import fr.hattane.ilias.rtt.cpcc.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addresss")
public class AddressPageController extends AbstractCrudPageController<Address, Long> {
    public AddressPageController(AddressService service) {
        super(service.getRepository(), Address.class, "addresss");
    }
}
