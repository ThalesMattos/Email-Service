package com.emailservice.emailservice.implementations.ses;

import com.emailservice.emailservice.adapters.IEmailSenderGateway;
import com.emailservice.emailservice.core.exceptions.EmailServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSenderGatewayImpl implements IEmailSenderGateway {

    private final MailSender mailSender;

    @Override
    public void sendEmail(String to, String subject, String body) {
        var simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("thalescarvalho622@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);
        try {
            mailSender.send(simpleMailMessage);
        } catch (MailException e) {
            throw new EmailServiceException("Falha ao construir o email", e);
        }
    }
}