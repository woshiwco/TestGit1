package com.wc.entity;

import java.time.LocalDate;

public class User {
    // 定义姓名
    private String username;
    private String password;

    private Integer age;
    private LocalDate bir;
    
    public String getUsername() {
        return username;
    }
    // 定义了get方法

    public Integer getAge() {
        return age;
    }
}
