package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.products.Element;
import fr.hattane.ilias.rtt.cpcc.repository.ElementRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/elements")
public class ElementController extends AbstractCrudRestController<Element, Long> {
    public ElementController(ElementRepository repository) {
        super(repository);
    }
}
