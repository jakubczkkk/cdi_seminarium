package com.example.cdi_seminarium.messages;

@MessageFQualifier
public class MessageF implements QualiferMessage {

    public String getMessage() {
        return "Message F";
    }

}