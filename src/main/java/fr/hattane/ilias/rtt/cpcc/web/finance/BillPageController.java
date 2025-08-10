package fr.hattane.ilias.rtt.cpcc.web.finance;

import fr.hattane.ilias.rtt.cpcc.entity.finance.Bill;
import fr.hattane.ilias.rtt.cpcc.service.finance.BillService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bills")
public class BillPageController extends AbstractCrudPageController<Bill, Long> {
    public BillPageController(BillService service) {
        super(service.getRepository(), Bill.class, "bills");
    }
}
