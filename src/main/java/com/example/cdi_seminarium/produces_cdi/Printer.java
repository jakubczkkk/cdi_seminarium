package com.example.cdi_seminarium.produces_cdi;

import com.example.cdi_seminarium.messages.Message;
import com.example.cdi_seminarium.messages.NamedMessage;
import com.example.cdi_seminarium.messages.SimpleMessage;

import javax.inject.Inject;
import javax.inject.Named;
import java.sql.Time;

public class Printer {

    @Inject
    private SimpleMessage message;

    private TimeLogger timeLogger;

    @Inject
    public Printer(TimeLogger timeLogger) {
        this.timeLogger = timeLogger;
    }

    public String printMessage() {
        return message.getMessage();
    }
    
    public String printTime() { return timeLogger.getTime(); }

}