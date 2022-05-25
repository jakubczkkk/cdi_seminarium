package com.example.cdi_seminarium.injection_point_cdi;

import com.example.cdi_seminarium.messages.SimpleMessage;

import javax.inject.Inject;

public class PrinterSetter {

    private SimpleMessage message;

    @Inject
    void setMessage(SimpleMessage message) {
        this.message = message;
    }

    public String printMessage() {
        return "Setter: " + message.getMessage();
    }

}
