package com.example.cdi_seminarium.messages;

@MessageEQualifier
public class MessageE implements QualiferMessage {

    public String getMessage() {
        return "Message E";
    }

}
