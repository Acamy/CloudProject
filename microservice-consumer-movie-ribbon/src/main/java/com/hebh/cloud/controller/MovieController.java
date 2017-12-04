package com.hebh.cloud.controller;

import com.hebh.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Hebh
 * @date 2017/11/24
 * @description:
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        //http://localhost:7900/simple/
        //VIP virtual IP
        return this.restTemplate.getForObject("http://microservice-provider-user/simple/" + id, User.class);
    }
}
