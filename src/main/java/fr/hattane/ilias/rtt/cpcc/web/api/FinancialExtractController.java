package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.finance.FinancialExtract;
import fr.hattane.ilias.rtt.cpcc.repository.FinancialExtractRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/financial-extracts")
public class FinancialExtractController extends AbstractCrudRestController<FinancialExtract, Long> {
    public FinancialExtractController(FinancialExtractRepository repository) {
        super(repository);
    }
}
