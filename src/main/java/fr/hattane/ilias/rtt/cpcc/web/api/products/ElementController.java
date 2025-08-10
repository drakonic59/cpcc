package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.Element;
import fr.hattane.ilias.rtt.cpcc.repository.products.ElementRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elements")
public class ElementController extends AbstractCrudRestController<Element, Long> {
    public ElementController(ElementRepository repository) {
        super(repository);
    }
}
