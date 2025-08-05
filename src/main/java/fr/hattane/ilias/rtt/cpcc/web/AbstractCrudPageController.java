package fr.hattane.ilias.rtt.cpcc.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractCrudPageController<T, ID> {
    private final CrudRepository<T, ID> repository;
    private final Class<T> entityClass;
    private final String basePath;
    private final List<String> fields;

    protected AbstractCrudPageController(CrudRepository<T, ID> repository, Class<T> entityClass, String basePath) {
        this.repository = repository;
        this.entityClass = entityClass;
        this.basePath = basePath;
        this.fields = Arrays.stream(entityClass.getDeclaredFields())
                .filter(f -> !f.isSynthetic())
                .map(Field::getName)
                .collect(Collectors.toList());
    }

    @GetMapping
    public String index() {
        return basePath + "/index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("items", repository.findAll());
        model.addAttribute("fields", fields);
        model.addAttribute("path", basePath);
        model.addAttribute("title", entityClass.getSimpleName() + " List");
        return basePath + "/list";
    }

    @GetMapping("/add")
    public String add(Model model) throws Exception {
        model.addAttribute("item", entityClass.getDeclaredConstructor().newInstance());
        model.addAttribute("fields", fields);
        model.addAttribute("path", basePath);
        model.addAttribute("title", entityClass.getSimpleName() + " Form");
        return basePath + "/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable ID id, Model model) {
        model.addAttribute("item", repository.findById(id).orElseThrow());
        model.addAttribute("fields", fields);
        model.addAttribute("path", basePath);
        model.addAttribute("title", entityClass.getSimpleName() + " Form");
        return basePath + "/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute T item) {
        repository.save(item);
        return "redirect:/" + basePath + "/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable ID id) {
        repository.deleteById(id);
        return "redirect:/" + basePath + "/list";
    }
}
