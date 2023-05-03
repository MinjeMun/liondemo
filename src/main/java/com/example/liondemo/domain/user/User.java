package com.example.liondemo.domain.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id// 해당 필드를 primary key로 간주
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    @Column(nullable = false)
    private String name;
    private Integer age;
    // Int 대신 Integer : Null 나왔을 때 오류 안나오게 해줌 (wrapper 클래스)

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
