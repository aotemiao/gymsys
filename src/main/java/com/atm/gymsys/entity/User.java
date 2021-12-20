package com.atm.gymsys.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class User {
    @Id
    private String userId;

    private String password;

    private String sex;

    private Integer age;

    private String email;

}
