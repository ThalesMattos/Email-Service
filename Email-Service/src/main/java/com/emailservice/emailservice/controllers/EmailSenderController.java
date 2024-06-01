package com.emailservice.emailservice.controllers;

import com.emailservice.emailservice.application.EmailSenderServiceImpl;
import com.emailservice.emailservice.core.exceptions.EmailServiceException;
import com.emailservice.emailservice.core.EmailRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailSenderController{

    private final EmailSenderServiceImpl emailSenderService;

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request){
        try {
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("email send successfully");
        } catch (EmailServiceException exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email");
        }
    }
}
