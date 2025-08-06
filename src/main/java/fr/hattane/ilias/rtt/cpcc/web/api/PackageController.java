package fr.hattane.ilias.rtt.cpcc.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hattane.ilias.rtt.cpcc.entity.products.PackageEntity;
import fr.hattane.ilias.rtt.cpcc.repository.PackageRepository;

@RestController
@RequestMapping("/api/package-entitys")
public class PackageController extends AbstractCrudRestController<PackageEntity, Long> {
    public PackageController(PackageRepository repository) {
        super(repository);
    }
}
