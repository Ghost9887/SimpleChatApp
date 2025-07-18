package com.example.chatApplication.controller;

import com.example.chatApplication.model.Message;
import com.example.chatApplication.model.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MainController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(final Message message) throws Exception{
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getUsername(), message.getMessage(), time);
    }

}
