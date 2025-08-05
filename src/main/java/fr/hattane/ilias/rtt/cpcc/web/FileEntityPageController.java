package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.FileEntity;
import fr.hattane.ilias.rtt.cpcc.service.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fileentitys")
public class FileEntityPageController extends AbstractCrudPageController<FileEntity, Long> {
    public FileEntityPageController(FileService service) {
        super(service.getRepository(), FileEntity.class, "fileentitys");
    }
}
