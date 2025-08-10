package fr.hattane.ilias.rtt.cpcc.web.api.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Message;
import fr.hattane.ilias.rtt.cpcc.repository.customers.MessageRepository;
import fr.hattane.ilias.rtt.cpcc.web.api.AbstractCrudRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController extends AbstractCrudRestController<Message, Long> {
    public MessageController(MessageRepository repository) {
        super(repository);
    }
}
