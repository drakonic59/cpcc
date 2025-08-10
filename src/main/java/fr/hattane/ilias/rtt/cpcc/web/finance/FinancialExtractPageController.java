package fr.hattane.ilias.rtt.cpcc.web.finance;

import fr.hattane.ilias.rtt.cpcc.entity.finance.FinancialExtract;
import fr.hattane.ilias.rtt.cpcc.service.finance.FinancialExtractService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/financialextracts")
public class FinancialExtractPageController extends AbstractCrudPageController<FinancialExtract, Long> {
    public FinancialExtractPageController(FinancialExtractService service) {
        super(service.getRepository(), FinancialExtract.class, "financialextracts");
    }
}
