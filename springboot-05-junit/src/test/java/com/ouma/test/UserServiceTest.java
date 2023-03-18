package com.ouma.test;


import com.ouma.service.UserService;
import com.ouma.springboot05junit.Springboot05JunitApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot05JunitApplication.class)
public class UserServiceTest {
    @Autowired
    public UserService userService;

    @Test
   public void test()
   {
       userService.add();
   }

}
