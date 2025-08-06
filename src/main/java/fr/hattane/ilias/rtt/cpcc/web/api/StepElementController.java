package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.products.StepElement;
import fr.hattane.ilias.rtt.cpcc.entity.products.StepElementId;
import fr.hattane.ilias.rtt.cpcc.repository.StepElementRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/step-elements")
public class StepElementController {
    private final StepElementRepository repository;

    public StepElementController(StepElementRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<StepElement> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{stepId}/{elementId}")
    public ResponseEntity<StepElement> findById(@PathVariable("stepId") Long stepId,
                                                @PathVariable("elementId") Long elementId) {
        return repository.findById(new StepElementId(stepId, elementId))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public StepElement create(@RequestBody StepElement entity) {
        return repository.save(entity);
    }

    @PutMapping("/{stepId}/{elementId}")
    public StepElement update(@PathVariable("stepId") Long stepId,
                               @PathVariable("elementId") Long elementId,
                               @RequestBody StepElement entity) {
        return repository.save(entity);
    }

    @DeleteMapping("/{stepId}/{elementId}")
    public void delete(@PathVariable("stepId") Long stepId,
                       @PathVariable("elementId") Long elementId) {
        repository.deleteById(new StepElementId(stepId, elementId));
    }
}
