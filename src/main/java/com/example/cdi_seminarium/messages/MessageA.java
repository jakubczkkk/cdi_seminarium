package com.example.cdi_seminarium.messages;

import javax.enterprise.inject.Alternative;

@Alternative
public class MessageA implements Message {

    public String getMessage() {
        return "Message A";
    }

}
