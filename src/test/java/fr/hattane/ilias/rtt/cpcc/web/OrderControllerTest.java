package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.orders.Order;
import fr.hattane.ilias.rtt.cpcc.repository.OrderRepository;
import fr.hattane.ilias.rtt.cpcc.service.OrderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderControllerTest {

    @Test
    void listReturnsViewWithItemsAndPage() {
        OrderRepository repo = Mockito.mock(OrderRepository.class);
        List<Order> items = List.of(new Order());
        when(repo.findAll()).thenReturn(items);
        OrderService service = new OrderService(repo);
        OrderController controller = new OrderController(service);
        Model model = new ConcurrentModel();

        String view = controller.list(model);

        assertEquals("orders/list", view);
        assertSame(items, model.getAttribute("items"));
        assertNotNull(model.getAttribute("fields"));
        assertEquals("orders", model.getAttribute("page"));
        verify(repo).findAll();
    }
}
