package com.example.cdi_seminarium.messages;

import javax.enterprise.inject.Default;

//@Default
public class MessageB implements Message {

    public String getMessage() {
        return "Message B";
    }

}