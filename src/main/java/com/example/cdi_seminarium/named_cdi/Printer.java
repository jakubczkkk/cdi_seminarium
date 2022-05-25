package com.example.cdi_seminarium.named_cdi;

import com.example.cdi_seminarium.messages.Message;
import com.example.cdi_seminarium.messages.NamedMessage;

import javax.inject.Inject;
import javax.inject.Named;

public class Printer {

    @Inject
    private @Named("messageC") NamedMessage messageC;

    @Inject
    private @Named("messageD") NamedMessage messageD;

    public String printMessage() {
        return messageC.getMessage() + " " + messageD.getMessage();
    }

}