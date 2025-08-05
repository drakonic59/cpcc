package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Element;
import fr.hattane.ilias.rtt.cpcc.service.ElementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/elements")
public class ElementPageController extends AbstractCrudPageController<Element, Long> {
    public ElementPageController(ElementService service) {
        super(service.getRepository(), Element.class, "elements");
    }
}
