package com.mytest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={ "com.mytest.repo"})
@EntityScan(basePackages ={ "com.mytest.model"})
public class SpringBootMainProgram {
    public static void main(String[] args) throws Exception {
        new SpringApplication(SpringBootMainProgram .class).run(args);
    }
}
