package com.example.jmsproject.listener;

import com.example.jmsproject.config.JmsConfig;
import com.example.jmsproject.model.HelloworldMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class listener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listener(@Payload HelloworldMessage helloworldMessage,
                        @Headers MessageHeaders headers, Message message) {

        System.out.println("I got a message!!");
        System.out.println(helloworldMessage);

    }

}
