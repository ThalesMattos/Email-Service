package com.thalesmattos.servicodeemail.infrastructure.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class awsSesConfig {
    @Bean
    public AmazonSimpleEmailService amazonSimpleEmailService(){
        return AmazonSimpleEmailServiceClientBuilder.standard().build();
    }
}
