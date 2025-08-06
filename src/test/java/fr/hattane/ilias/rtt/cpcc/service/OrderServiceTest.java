package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.OrderRepository;
import org.junit.jupiter.api.Test;

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
