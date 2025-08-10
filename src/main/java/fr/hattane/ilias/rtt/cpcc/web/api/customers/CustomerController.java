package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Customer;
import fr.hattane.ilias.rtt.cpcc.repository.customers.CustomerRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController extends AbstractCrudRestController<Customer, Long> {
    public CustomerController(CustomerRepository repository) {
        super(repository);
    }
}
