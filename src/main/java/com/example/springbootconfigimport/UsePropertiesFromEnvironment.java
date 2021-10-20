package com.example.springbootconfigimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 20.10.2021.</p>
 * <p>Project: spring-boot-config-import</p>
 * *
 */
@Service
public class UsePropertiesFromEnvironment {

    private final Environment environment;

    public UsePropertiesFromEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void display() {
        System.out.println("from application.properties: "+environment.getProperty("dummy.prop4"));
        System.out.println("from application.yaml: "+environment.getProperty("dummy.prop3"));
    }

    ;
}
