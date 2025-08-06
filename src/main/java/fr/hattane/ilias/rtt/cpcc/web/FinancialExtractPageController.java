package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.finance.FinancialExtract;
import fr.hattane.ilias.rtt.cpcc.service.FinancialExtractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/financialextracts")
public class FinancialExtractPageController extends AbstractCrudPageController<FinancialExtract, Long> {
    public FinancialExtractPageController(FinancialExtractService service) {
        super(service.getRepository(), FinancialExtract.class, "financialextracts");
    }
}
