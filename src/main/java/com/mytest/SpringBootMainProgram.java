package com.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ={ "com.mytest.controller"})
public class SpringBootMainProgram {
    public static void main(String[] args) throws Exception {
        new SpringApplication(SpringBootMainProgram .class).run(args);
    }
}
