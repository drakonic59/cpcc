package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.finance.Bill;
import fr.hattane.ilias.rtt.cpcc.repository.BillRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bills")
public class BillController extends AbstractCrudRestController<Bill, Long> {
    public BillController(BillRepository repository) {
        super(repository);
    }
}
