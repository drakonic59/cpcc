package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Address;
import fr.hattane.ilias.rtt.cpcc.repository.customers.AddressRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addresss")
public class AddressController extends AbstractCrudRestController<Address, Long> {
    public AddressController(AddressRepository repository) {
        super(repository);
    }
}
