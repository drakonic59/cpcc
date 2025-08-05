package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Bill;
import fr.hattane.ilias.rtt.cpcc.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bills")
public class BillPageController extends AbstractCrudPageController<Bill, Long> {
    public BillPageController(BillService service) {
        super(service.getRepository(), Bill.class, "bills");
    }
}
