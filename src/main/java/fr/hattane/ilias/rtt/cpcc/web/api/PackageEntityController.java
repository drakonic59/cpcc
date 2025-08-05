package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.PackageEntity;
import fr.hattane.ilias.rtt.cpcc.repository.PackageEntityRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/package-entitys")
public class PackageEntityController extends AbstractCrudRestController<PackageEntity, Long> {
    public PackageEntityController(PackageEntityRepository repository) {
        super(repository);
    }
}
