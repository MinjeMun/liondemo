package com.example.liondemo.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserResponse {
    private Long id;
    private String name;
    private Integer age;

    public UserResponse(Long id, String name, Integer age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}
