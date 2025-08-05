package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.PackageEntity;
import fr.hattane.ilias.rtt.cpcc.service.PackageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/packageentitys")
public class PackageEntityPageController extends AbstractCrudPageController<PackageEntity, Long> {
    public PackageEntityPageController(PackageService service) {
        super(service.getRepository(), PackageEntity.class, "packageentitys");
    }
}
