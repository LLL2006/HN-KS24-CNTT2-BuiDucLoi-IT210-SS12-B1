package com.re.ss12b1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ss12B1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ss12B1Application.class, args);
        System.out.println("Hospital Web Service is ready on Embedded Tomcat!");

    }

}
