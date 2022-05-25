package com.example.cdi_seminarium.injection_point_cdi;

import com.example.cdi_seminarium.messages.SimpleMessage;

import javax.inject.Inject;

public class PrinterConstructor {

    private SimpleMessage message;

    @Inject
    public PrinterConstructor(SimpleMessage message) {
        this.message = message;
    }

    public String printMessage() {
        return "Constructor: " + message.getMessage();
    }

}
