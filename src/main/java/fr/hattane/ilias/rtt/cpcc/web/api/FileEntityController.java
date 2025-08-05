package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import fr.hattane.ilias.rtt.cpcc.repository.FileEntityRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/file-entitys")
public class FileEntityController extends AbstractCrudRestController<FileEntity, Long> {
    public FileEntityController(FileEntityRepository repository) {
        super(repository);
    }
}
