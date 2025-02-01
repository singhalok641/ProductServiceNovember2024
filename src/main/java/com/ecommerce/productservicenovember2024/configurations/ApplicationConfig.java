package com.ecommerce.productservicenovember2024.configurations;


/*
This is a configuration class in SpringBoot Application.
It is annotated with @configuration, indicating that this provides
bean definitions and configuration for the application context
 */

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
    @Bean // Denotes that this method is a bean producer
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }
}
