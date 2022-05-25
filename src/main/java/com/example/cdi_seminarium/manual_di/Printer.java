package com.example.cdi_seminarium.manual_di;

import com.example.cdi_seminarium.messages.SimpleMessage;

public class Printer {

    private final SimpleMessage message;

    public Printer(SimpleMessage message) {
        this.message = message;
    }

    public String printMessage() {
        return message.getMessage();
    }

}
