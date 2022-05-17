package com.saitej.springboot.actuatorbasics.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService implements HealthIndicator {


    public static final String DB_SERVICE = "Database Service";

    @Override
    public Health health() {
        if(isDBHealthOk()) {
            return Health.up().withDetail(DB_SERVICE, "Service is running").build();
        }
        return Health.down().withDetail(DB_SERVICE,"Service is not available").build();
    }

    public boolean isDBHealthOk(){
        //actual logic goes here
        return true;
    }
}
