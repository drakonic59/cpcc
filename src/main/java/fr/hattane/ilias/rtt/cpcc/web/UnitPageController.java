package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Unit;
import fr.hattane.ilias.rtt.cpcc.service.UnitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/units")
public class UnitPageController extends AbstractCrudPageController<Unit, Long> {
    public UnitPageController(UnitService service) {
        super(service.getRepository(), Unit.class, "units");
    }
}
