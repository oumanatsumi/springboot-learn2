package com.ouma.springboot09adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Springboot09AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot09AdminServerApplication.class, args);
    }

}
