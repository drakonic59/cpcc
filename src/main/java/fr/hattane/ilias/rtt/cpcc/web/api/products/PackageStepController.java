package fr.hattane.ilias.rtt.cpcc.web.api.products;

import fr.hattane.ilias.rtt.cpcc.entity.products.PackageStep;
import fr.hattane.ilias.rtt.cpcc.entity.products.PackageStepId;
import fr.hattane.ilias.rtt.cpcc.repository.products.PackageStepRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/package-steps")
public class PackageStepController {
    private final PackageStepRepository repository;

    public PackageStepController(PackageStepRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<PackageStep> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{packageId}/{stepId}")
    public ResponseEntity<PackageStep> findById(@PathVariable("packageId") Long packageId,
                                                @PathVariable("stepId") Long stepId) {
        return repository.findById(new PackageStepId(packageId, stepId))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public PackageStep create(@RequestBody PackageStep entity) {
        return repository.save(entity);
    }

    @PutMapping("/{packageId}/{stepId}")
    public PackageStep update(@PathVariable("packageId") Long packageId,
                              @PathVariable("stepId") Long stepId,
                              @RequestBody PackageStep entity) {
        return repository.save(entity);
    }

    @DeleteMapping("/{packageId}/{stepId}")
    public void delete(@PathVariable("packageId") Long packageId,
                       @PathVariable("stepId") Long stepId) {
        repository.deleteById(new PackageStepId(packageId, stepId));
    }
}
