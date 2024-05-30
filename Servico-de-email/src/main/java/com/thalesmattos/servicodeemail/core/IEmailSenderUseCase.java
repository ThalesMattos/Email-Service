package com.thalesmattos.servicodeemail.core;

public interface IEmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
