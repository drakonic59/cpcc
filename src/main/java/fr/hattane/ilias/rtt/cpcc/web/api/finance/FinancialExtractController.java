package fr.hattane.ilias.rtt.cpcc.web.api.finance;

import fr.hattane.ilias.rtt.cpcc.entity.finance.FinancialExtract;
import fr.hattane.ilias.rtt.cpcc.repository.finance.FinancialExtractRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/financial-extracts")
public class FinancialExtractController extends AbstractCrudRestController<FinancialExtract, Long> {
    public FinancialExtractController(FinancialExtractRepository repository) {
        super(repository);
    }
}
