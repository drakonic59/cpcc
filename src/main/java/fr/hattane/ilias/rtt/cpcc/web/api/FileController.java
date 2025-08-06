package fr.hattane.ilias.rtt.cpcc.web.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import fr.hattane.ilias.rtt.cpcc.repository.FileRepository;

@RestController
@RequestMapping("/api/files")
public class FileController extends AbstractCrudRestController<FileEntity, Long> {
    public FileController(FileRepository repository) {
        super(repository);
    }
}
