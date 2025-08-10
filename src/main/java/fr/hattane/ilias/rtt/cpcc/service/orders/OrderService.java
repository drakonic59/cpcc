package fr.hattane.ilias.rtt.cpcc.service.orders;

import org.springframework.stereotype.Service;

import fr.hattane.ilias.rtt.cpcc.repository.orders.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public OrderRepository getRepository() {
        return repository;
    }
}
