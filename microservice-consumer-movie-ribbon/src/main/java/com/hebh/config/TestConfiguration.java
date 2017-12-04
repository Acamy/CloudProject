package com.hebh.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hebh
 * @date 2017/12/4
 * @description:
 */
@Configuration
public class TestConfiguration {
    @Autowired
    IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }

}
