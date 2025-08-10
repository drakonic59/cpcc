package fr.hattane.ilias.rtt.cpcc.web.api.orders;

import fr.hattane.ilias.rtt.cpcc.entity.orders.Unit;
import fr.hattane.ilias.rtt.cpcc.repository.orders.UnitRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/units")
public class UnitController extends AbstractCrudRestController<Unit, Long> {
    public UnitController(UnitRepository repository) {
        super(repository);
    }
}
