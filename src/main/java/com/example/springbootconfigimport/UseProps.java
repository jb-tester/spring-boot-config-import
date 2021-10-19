package com.example.springbootconfigimport;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 10/19/2021.</p>
 * <p>Project: spring-boot-config-import</p>
 * *
 */
@Component
public class UseProps {

    @Value("${foo.prop1:default foo.prop1}") String foop1;
    @Value("${foo.prop2:default foo.prop2}") String foop2;
    @Value("${bar.prop1:default bar.prop1}") String barp1;
    @Value("${bar.prop2:default bar.prop2}") String barp2;
    @Value("${buzz.prop1:default buzz.prop1}") String buzzp1;
    @Value("${buzz.prop2:default buzz.prop2}") String buzzp2;
    @Value("${dummy.prop1:default dummy.prop1}") String dummyp1;
    @Value("${dummy.prop2:default dummy.prop2}") String dummyp2;

    // test property reference: https://youtrack.jetbrains.com/issue/IDEA-280745
    @Value("${dummy.prop3}") String fromMainYaml;
    @Value("${buzz.prop4}") String fromImportedYaml;   // doesn't work
    @Value("${buzz.prop3}") String fromImportedProperties;
    
    public void display() {
        System.out.println(foop1);
        System.out.println(foop2);
        System.out.println(barp1);
        System.out.println(barp2);
        System.out.println(buzzp1);
        System.out.println(buzzp2);
        System.out.println(dummyp1);
        System.out.println(dummyp2);
    }

    ;
}
