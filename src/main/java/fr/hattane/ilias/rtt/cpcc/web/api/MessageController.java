package fr.hattane.ilias.rtt.cpcc.web.api;

import fr.hattane.ilias.rtt.cpcc.entity.Message;
import fr.hattane.ilias.rtt.cpcc.repository.MessageRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController extends AbstractCrudRestController<Message, Long> {
    public MessageController(MessageRepository repository) {
        super(repository);
    }
}
