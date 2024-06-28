package com.example.redisresponsecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisResponseCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisResponseCacheApplication.class, args);
    }

}
