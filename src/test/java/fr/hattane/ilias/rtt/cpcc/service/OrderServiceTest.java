package fr.hattane.ilias.rtt.cpcc.service;

import org.junit.jupiter.api.Test;

import fr.hattane.ilias.rtt.cpcc.repository.orders.OrderRepository;
import fr.hattane.ilias.rtt.cpcc.service.orders.OrderService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class OrderServiceTest {
    @Test
    void repositoryIsExposed() {
        OrderRepository repo = mock(OrderRepository.class);
        OrderService service = new OrderService(repo);
        assertSame(repo, service.getRepository());
    }
}
