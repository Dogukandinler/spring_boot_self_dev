package com.dodo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String sendMessage(String message) {
        System.out.println(message);
        return message;
    }
}
