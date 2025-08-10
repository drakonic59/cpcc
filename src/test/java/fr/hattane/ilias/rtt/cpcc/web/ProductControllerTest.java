package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.products.Product;
import fr.hattane.ilias.rtt.cpcc.repository.products.ProductRepository;
import fr.hattane.ilias.rtt.cpcc.service.products.ProductService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductControllerTest {

    @Test
    void listReturnsViewWithItems() {
        ProductRepository repo = Mockito.mock(ProductRepository.class);
        List<Product> items = List.of(new Product());
        when(repo.findAll()).thenReturn(items);
        ProductService service = new ProductService(repo);
        ProductController controller = new ProductController(service);
        Model model = new ConcurrentModel();

        String view = controller.list(model);

        assertEquals("products/list", view);
        assertSame(items, model.getAttribute("items"));
        assertNotNull(model.getAttribute("fields"));
        assertEquals("products", model.getAttribute("page"));
        verify(repo).findAll();
    }
}
