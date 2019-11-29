package ltu.message.consumers;

import ltu.message.domain.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;

@Component
public class EmailReceiver {

    @JmsListener(destination = "test-queue", containerFactory = "containerFactory")
    public void receiveMessage(String message) throws JMSException {
        System.out.println("Received: " + message);
    }
}
