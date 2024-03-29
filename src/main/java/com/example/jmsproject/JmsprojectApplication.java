package com.example.jmsproject;

import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class JmsprojectApplication {

    public static void main(String[] args) throws Exception {

        ActiveMQServer server= ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
                .setPersistenceEnabled(false)
                .setJournalDirectory("target/data/journal")
                .setSecurityEnabled(false)
                .addAcceptorConfiguration("invm","vm://0"));

        server.start();

        SpringApplication.run(JmsprojectApplication.class, args);
    }

}
