package com.ouma.springboot04redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Springboot04RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet(){
        redisTemplate.boundValueOps("name").set("zhangsan");

    }

    @Test
    public void testGet(){
        Object name1 = redisTemplate.boundValueOps("name").get();
        System.out.println(name1);
    }

    @Test
    void contextLoads() {

    }

}
