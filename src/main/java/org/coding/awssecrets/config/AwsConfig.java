package org.coding.awssecrets.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AwsConfig {
    @Value("${clientId}")
    private String clientId;
}