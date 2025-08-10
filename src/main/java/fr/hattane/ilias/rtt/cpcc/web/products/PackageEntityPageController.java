package fr.hattane.ilias.rtt.cpcc.web.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.PackageEntity;
import fr.hattane.ilias.rtt.cpcc.service.products.PackageService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/packageentitys")
public class PackageEntityPageController extends AbstractCrudPageController<PackageEntity, Long> {
    public PackageEntityPageController(PackageService service) {
        super(service.getRepository(), PackageEntity.class, "packageentitys");
    }
}
