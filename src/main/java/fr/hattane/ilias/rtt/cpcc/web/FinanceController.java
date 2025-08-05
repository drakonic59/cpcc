package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.service.FinancialExtractService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finance")
public class FinanceController {
    private final FinancialExtractService service;

    public FinanceController(FinancialExtractService service) {
        this.service = service;
    }

    @GetMapping
    public String hub() {
        return "finance/index";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("extracts", service.getRepository().findAll());
        return "finance/list";
    }
}
