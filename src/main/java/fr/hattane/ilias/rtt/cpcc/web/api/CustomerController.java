package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Customer;
import fr.hattane.ilias.rtt.cpcc.repository.CustomerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController extends AbstractCrudRestController<Customer, Long> {
    public CustomerController(CustomerRepository repository) {
        super(repository);
    }
}
