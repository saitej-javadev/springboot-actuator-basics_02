package com.saitej.springboot.actuatorbasics.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggingService implements HealthIndicator {


    public static final String LOGGER_SERVICE = "Logging Service";

    @Override
    public Health health() {
        if(isLoggerHealthOk()) {
            return Health.up().withDetail(LOGGER_SERVICE, "Service is running").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE,"Service is not available").build();
    }

    public boolean isLoggerHealthOk(){
        //actual logic goes here
        return false;
    }
}


