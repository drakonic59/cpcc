package fr.hattane.ilias.rtt.cpcc.service;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MailServiceTest {

    @Test
    void sendDelegatesToMailSender() {
        JavaMailSender sender = mock(JavaMailSender.class);
        MailService service = new MailService(sender);

        service.send("to@example.com", "subject", "body");

        ArgumentCaptor<SimpleMailMessage> captor = ArgumentCaptor.forClass(SimpleMailMessage.class);
        verify(sender).send(captor.capture());
        SimpleMailMessage message = captor.getValue();
        assertArrayEquals(new String[]{"to@example.com"}, message.getTo());
        assertEquals("subject", message.getSubject());
        assertEquals("body", message.getText());
    }
}
