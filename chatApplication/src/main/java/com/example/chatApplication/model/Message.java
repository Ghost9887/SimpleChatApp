package com.example.chatApplication.model;

public class Message {

    private String username;
    private String message;

    public Message(){}

    public Message(String username, String message){
        this.username = username;
        this.message = message;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getUsername(){
        return username;
    }

    public String getMessage(){
        return message;
    }

}
