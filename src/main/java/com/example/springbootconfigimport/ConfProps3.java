package com.example.springbootconfigimport;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 19.10.2021.</p>
 * <p>Project: spring-boot-config-import</p>
 * *
 */
@ConfigurationProperties("buzz")
public class ConfProps3 {
    String prop1;
    String prop2;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }
}
