package ltu.message.consumers;

import ltu.message.domain.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.MessageConsumer;

@Component
public class EmailReceiver {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
/**
    @JmsListener(destination = "test-queue", containerFactory = "containerFactory")
    public void receiveMessage(String message) throws JMSException {
        logger.info("Message received {} ", message);
        System.out.println("Received: " + message);
    }
    **/
}
