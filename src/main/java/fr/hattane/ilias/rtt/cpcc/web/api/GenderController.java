package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.Gender;
import fr.hattane.ilias.rtt.cpcc.repository.GenderRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genders")
public class GenderController extends AbstractCrudRestController<Gender, Long> {
    public GenderController(GenderRepository repository) {
        super(repository);
    }
}
