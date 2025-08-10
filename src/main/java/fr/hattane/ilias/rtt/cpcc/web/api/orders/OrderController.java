package fr.hattane.ilias.rtt.cpcc.web.api.orders;

import fr.hattane.ilias.rtt.cpcc.entity.orders.Order;
import fr.hattane.ilias.rtt.cpcc.repository.orders.OrderRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController extends AbstractCrudRestController<Order, Long> {
    public OrderController(OrderRepository repository) {
        super(repository);
    }
}
