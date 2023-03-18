package com.ouma.springboot05junit;

import com.ouma.service.EnableUserService;
import com.ouma.service.UserService;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


// 三种方法应对UserService无法注入的问题
// 1.
//@ComponentScan(value = "com.ouma")
// 2.
//@Import(UserService.class)
// 3. 自定义注解
@EnableUserService

@SpringBootApplication
public class Springboot05JunitApplication{

    public static void main(String[] args) {
        SpringApplication.run(Springboot05JunitApplication.class, args);
    }

}
