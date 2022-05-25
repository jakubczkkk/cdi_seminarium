package com.example.cdi_seminarium.messages;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class LogMessage {

    public String getMessage() {
        return "Message";
    }

    @PostConstruct
    private void init() {
        System.out.println("Message injection completed");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Message destroyed");
    }
}
