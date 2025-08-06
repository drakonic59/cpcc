package fr.hattane.ilias.rtt.cpcc.web;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {
    @Test
    void indexReturnsViewAndPage() {
        HomeController controller = new HomeController();
        Model model = new ConcurrentModel();
        String view = controller.index(model);
        assertEquals("index", view);
        assertEquals("dashboard", model.getAttribute("page"));
    }
}
