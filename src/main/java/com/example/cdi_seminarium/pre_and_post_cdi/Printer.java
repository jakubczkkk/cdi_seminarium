package com.example.cdi_seminarium.pre_and_post_cdi;

import com.example.cdi_seminarium.messages.LogMessage;
import com.example.cdi_seminarium.messages.SimpleMessage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class Printer {

    @Inject
    private LogMessage message;

    public String printMessage() {
        String prepareMessage = message.getMessage();
        System.out.println("Printing message");
        return prepareMessage;
    }

    @PostConstruct
    private void init() {
        System.out.println("Printer injection completed");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Printer destroyed");
    }

}
