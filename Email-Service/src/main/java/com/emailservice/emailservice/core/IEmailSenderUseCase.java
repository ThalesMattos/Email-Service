package com.emailservice.emailservice.core;

public interface IEmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
