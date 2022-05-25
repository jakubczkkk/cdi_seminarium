package com.example.cdi_seminarium.simple_cdi;

import com.example.cdi_seminarium.messages.SimpleMessage;

import javax.inject.Inject;

public class Printer {

    @Inject
    private SimpleMessage message;

    public String printMessage() {
        return message.getMessage();
    }

}
