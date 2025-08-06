package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Customer;
import fr.hattane.ilias.rtt.cpcc.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerPageController {
    private final CustomerService service;

    public CustomerPageController(CustomerService service) {
        this.service = service;
    }

    private static final java.util.List<String> FIELDS = java.util.List.of(
            "id", "firstName", "lastName", "mail", "phone"
    );

    @GetMapping
    public String hub(Model model) {
        model.addAttribute("page", "customers");
        return "customers/index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("items", service.getRepository().findAll());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "customers");
        return "customers/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("item", new Customer());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "customers");
        return "customers/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getRepository().findById(id).orElseThrow());
        model.addAttribute("fields", FIELDS);
        model.addAttribute("page", "customers");
        return "customers/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Customer customer) {
        service.getRepository().save(customer);
        return "redirect:/customers/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.getRepository().deleteById(id);
        return "redirect:/customers/list";
    }
}
