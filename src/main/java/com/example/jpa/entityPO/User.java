package com.example.jpa.entityPO;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_t")
@Data
public class User {
    @Id
    private  int id;
    @Column(name = "user_name")
    private  String userName;
    @Column(name = "phone_number")
    private  String phoneNumber;
    private  String password;
    private  String age;
    private  String sex;



}
