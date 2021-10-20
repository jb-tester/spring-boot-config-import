package com.example.springbootconfigimport;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 19.10.2021.</p>
 * <p>Project: spring-boot-config-import</p>
 * *
 */
@ConfigurationProperties("dummy")
public class ConfProps4 {
    String prop1;
    String prop2;
    String prop3;
    String prop4;
    
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

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3;
    }

    public String getProp4() {
        return prop4;
    }

    public void setProp4(String prop4) {
        this.prop4 = prop4;
    }
}
