package com.emailservice.emailservice.controllers;

import com.emailservice.emailservice.services.EmailSenderService;
import com.emailservice.emailservice.core.vo.EmailRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailSenderController{

    private final EmailSenderService emailSenderService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
        this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
        return ResponseEntity.ok("Email send successfully");
    }
}
