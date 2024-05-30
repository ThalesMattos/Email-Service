package com.thalesmattos.servicodeemail.adapters;

public interface IEmailSenderGateway {
    void sendEmail (String to, String subject, String body);
}