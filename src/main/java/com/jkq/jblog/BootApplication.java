package com.jkq.jblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootApplication.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        //log.info("mblog started at http://localhost:" + serverPort);
    }

}
