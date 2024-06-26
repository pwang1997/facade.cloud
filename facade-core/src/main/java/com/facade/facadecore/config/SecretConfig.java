package com.facade.facadecore.config;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Puck Wang
 * @project Blog
 * @created 3/15/2024
 */

@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
@Slf4j
@Getter
public class SecretConfig {

    @Value("${secret.api}")
    private String secretToken;

    @Value("${redis.host}")
    private String redisHost;
    private final int redisPort = 6379;

    @Value("${secret.redis.password}")
    private String redisPassword;
}
