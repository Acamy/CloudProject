package com.hebh.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hebh
 * @date 2017/12/4
 * @description:
 */
@Configuration
public class MyFeignConfiguration {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

}
