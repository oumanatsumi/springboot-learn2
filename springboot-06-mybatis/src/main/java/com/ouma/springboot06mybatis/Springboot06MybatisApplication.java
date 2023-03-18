package com.ouma.springboot06mybatis;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import redis.clients.jedis.Jedis;

@SpringBootApplication
//@MapperScan("com.ouma.mapper")
public class Springboot06MybatisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springboot06MybatisApplication.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

        jedis.set("age", "13");
        System.out.println(jedis.get("name"));
        System.out.println(jedis.get("age"));
    }

}
