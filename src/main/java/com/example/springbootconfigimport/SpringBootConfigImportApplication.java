package com.example.springbootconfigimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootConfigImportApplication implements CommandLineRunner {

    @Autowired
    private UseProps useProps;
    @Autowired
    private UsePropertiesFromEnvironment usePropertiesFromEnvironment;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigImportApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        useProps.display();
        usePropertiesFromEnvironment.display();
    }
}
