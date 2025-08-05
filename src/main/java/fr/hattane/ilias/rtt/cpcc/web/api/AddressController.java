package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.Address;
import fr.hattane.ilias.rtt.cpcc.repository.AddressRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/addresss")
public class AddressController extends AbstractCrudRestController<Address, Long> {
    public AddressController(AddressRepository repository) {
        super(repository);
    }
}
