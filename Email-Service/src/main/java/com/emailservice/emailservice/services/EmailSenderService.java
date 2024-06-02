package com.emailservice.emailservice.services;

import com.emailservice.emailservice.adapters.IEmailSenderGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailSenderService {

    public final IEmailSenderGateway emailSenderGateway;

    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}