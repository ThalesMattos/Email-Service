package com.thalesmattos.servicodeemail.application;

import com.thalesmattos.servicodeemail.adapters.IEmailSenderGateway;
import com.thalesmattos.servicodeemail.core.IEmailSenderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailSenderService implements IEmailSenderUseCase {

    public final IEmailSenderGateway emailSenderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
