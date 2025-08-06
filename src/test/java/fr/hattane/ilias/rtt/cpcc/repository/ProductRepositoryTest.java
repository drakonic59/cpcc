package fr.hattane.ilias.rtt.cpcc.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import fr.hattane.ilias.rtt.cpcc.entity.products.Product;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    void saveAndRetrieveProduct() {
        Product product = new Product(1L, "Test", "desc", 1, 10.0, 5.0, LocalDateTime.now(), null);
        repository.save(product);
        Product found = repository.findById(1L).orElse(null);
        assertNotNull(found);
        assertEquals("Test", found.getName());
    }
}
