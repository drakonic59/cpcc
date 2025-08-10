package fr.hattane.ilias.rtt.cpcc.web.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Element;
import fr.hattane.ilias.rtt.cpcc.service.products.ElementService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/elements")
public class ElementPageController extends AbstractCrudPageController<Element, Long> {
    public ElementPageController(ElementService service) {
        super(service.getRepository(), Element.class, "elements");
    }
}
