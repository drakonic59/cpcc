package fr.hattane.ilias.rtt.cpcc.web.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Generic CRUD controller exposing basic REST endpoints.
 * Sub-classes only need to provide the repository and mapping annotation.
 */
public abstract class AbstractCrudRestController<T, ID> {
    private final CrudRepository<T, ID> repository;

    protected AbstractCrudRestController(CrudRepository<T, ID> repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<T> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable ID id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return repository.save(entity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> update(@PathVariable ID id, @RequestBody T entity) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(repository.save(entity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        repository.deleteById(id);
    }
}
