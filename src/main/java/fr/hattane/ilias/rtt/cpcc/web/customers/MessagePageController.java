package fr.hattane.ilias.rtt.cpcc.web.customers;

import fr.hattane.ilias.rtt.cpcc.entity.customers.Message;
import fr.hattane.ilias.rtt.cpcc.service.customers.MessageService;
import fr.hattane.ilias.rtt.cpcc.web.AbstractCrudPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class MessagePageController extends AbstractCrudPageController<Message, Long> {
    public MessagePageController(MessageService service) {
        super(service.getRepository(), Message.class, "messages");
    }
}
