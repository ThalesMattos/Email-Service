package com.thalesmattos.servicodeemail.core;

public record EmailRequest(String to, String subject, String body) {
}
