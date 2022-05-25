package com.example.cdi_seminarium.default_cdi;

import com.example.cdi_seminarium.messages.*;

import javax.inject.Inject;

public class Printer {

    @Inject
    private Message message;

    public String printMessage() {
        return message.getMessage();
    }

}