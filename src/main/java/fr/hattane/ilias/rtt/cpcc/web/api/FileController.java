package fr.hattane.ilias.rtt.cpcc.web.api;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import java.util.Optional;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/download/{id}")
    public ResponseEntity<Resource> downloadById(@PathVariable Long id) {
    
		if (getRepository().existsById(id)) {
			
			FileEntity file = getRepository().findById(id).get();
			ByteArrayResource resource = new ByteArrayResource(file.getBytes());
	        return ResponseEntity.ok()
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "." + file.getExtension() + "\"")
	                .body(resource);
			
		}
		return ResponseEntity.notFound().build();
    }
    
}
