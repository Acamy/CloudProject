package com.hebh.cloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Hebh
 * @date 2017/11/24
 * @description:
 */
public class User implements Serializable{
    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public Short getAge() {
        return age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
