package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.customers.CustomerType;
import fr.hattane.ilias.rtt.cpcc.repository.CustomerTypeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer-types")
public class CustomerTypeController extends AbstractCrudRestController<CustomerType, Long> {
    public CustomerTypeController(CustomerTypeRepository repository) {
        super(repository);
    }
}
