package com.dodo.api;

import com.dodo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<String> MessageSend(@RequestBody String message) {
        return ResponseEntity.ok(messageService.sendMessage(message));
    }

}
