package fr.hattane.ilias.rtt.cpcc.service;

import fr.hattane.ilias.rtt.cpcc.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    @Test
    void getRepositoryReturnsInjectedRepository() {
        CustomerRepository repository = Mockito.mock(CustomerRepository.class);
        CustomerService service = new CustomerService(repository);
        assertSame(repository, service.getRepository());
    }
}
