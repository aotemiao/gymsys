package com.atm.gymsys.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "gms_admin")
@Data
@Entity
public class Admin {
    @Id
    private String admin_Username;
    private String admin_Password;
}
