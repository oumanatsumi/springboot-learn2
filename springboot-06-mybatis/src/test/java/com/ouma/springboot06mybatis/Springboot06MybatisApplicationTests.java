package com.ouma.springboot06mybatis;

import com.ouma.mapper.UserMapper;
import com.ouma.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot06MybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> all = userMapper.findAll();
        for(User user :all) {
            System.out.println(user.toString());
        }
    }

    @Test
    void contextLoads() {
    }

}
