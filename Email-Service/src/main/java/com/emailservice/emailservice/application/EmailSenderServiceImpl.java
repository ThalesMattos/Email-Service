package com.emailservice.emailservice.application;

import com.emailservice.emailservice.adapters.IEmailSenderGateway;
import com.emailservice.emailservice.core.IEmailSenderUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailSenderServiceImpl implements IEmailSenderUseCase {

    public final IEmailSenderGateway emailSenderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
