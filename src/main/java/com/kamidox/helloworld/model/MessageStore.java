package com.kamidox.helloworld.model;

public class MessageStore {
    private static int helloCount = 0;
    private String message;

    public MessageStore() {
        message = "Hello Struts User";
        helloCount ++;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getHelloCount() {
        return helloCount;
    }

    @Override
    public String toString() {
        return message + "(from toString)";
    }
}
