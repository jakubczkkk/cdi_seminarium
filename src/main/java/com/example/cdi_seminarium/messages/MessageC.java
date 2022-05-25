package com.example.cdi_seminarium.messages;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
public class MessageC implements NamedMessage {

    public String getMessage() {
        return "Message C";
    }

}
