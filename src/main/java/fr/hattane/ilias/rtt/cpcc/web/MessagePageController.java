package fr.hattane.ilias.rtt.cpcc.web;

import fr.hattane.ilias.rtt.cpcc.entity.Message;
import fr.hattane.ilias.rtt.cpcc.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/messages")
public class MessagePageController extends AbstractCrudPageController<Message, Long> {
    public MessagePageController(MessageService service) {
        super(service.getRepository(), Message.class, "messages");
    }
}
