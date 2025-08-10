package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Gender;
import fr.hattane.ilias.rtt.cpcc.repository.customers.GenderRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genders")
public class GenderController extends AbstractCrudRestController<Gender, Long> {
    public GenderController(GenderRepository repository) {
        super(repository);
    }
}
