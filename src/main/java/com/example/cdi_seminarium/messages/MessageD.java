package com.example.cdi_seminarium.messages;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
public class MessageD implements NamedMessage {

    public String getMessage() {
        return "Message D";
    }

}
