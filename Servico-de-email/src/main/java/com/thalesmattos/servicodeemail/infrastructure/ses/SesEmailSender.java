package com.thalesmattos.servicodeemail.infrastructure.ses;

import com.thalesmattos.servicodeemail.adapters.EmailSenderGateway;
import com.thalesmattos.servicodeemail.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;
@Service
public class SesEmailSender implements EmailSenderGateway{
    private final AmazonSimpleEmailService amazonSimpleEmailService;
    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("thalescarvalho622@gmail.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );
        try {
            this.amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException exception){
            throw new EmailServiceException("Failute while sending email", exception);
        }
    }
}
