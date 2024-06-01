package com.emailservice.emailservice.adapters;

public interface IEmailSenderGateway {
    void sendEmail (String to, String subject, String body);
}