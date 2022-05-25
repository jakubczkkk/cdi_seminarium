package com.example.cdi_seminarium.custom_qualifiers_cdi;

import com.example.cdi_seminarium.messages.*;

import javax.inject.Inject;

public class Printer {

    @Inject
    @MessageEQualifier
    private QualiferMessage messageE;

    @Inject
    @MessageFQualifier
    private QualiferMessage messageF;

    public String printMessage() {
        return messageE.getMessage() + " " + messageF.getMessage();
    }

}