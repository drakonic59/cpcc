package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Order;
import fr.hattane.ilias.rtt.cpcc.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    private static final java.util.List<String> FIELDS = java.util.List.of(
            "id", "product", "orderedBy", "orderedAt", "quantity", "price"
    );

    @GetMapping
    public String hub() {
        return "orders/index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("items", service.getRepository().findAll());
        model.addAttribute("fields", FIELDS);
        return "orders/list";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("item", new Order());
        model.addAttribute("fields", FIELDS);
        return "orders/form";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("item", service.getRepository().findById(id).orElseThrow());
        model.addAttribute("fields", FIELDS);
        return "orders/form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Order order) {
        service.getRepository().save(order);
        return "redirect:/orders/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.getRepository().deleteById(id);
        return "redirect:/orders/list";
    }
}
