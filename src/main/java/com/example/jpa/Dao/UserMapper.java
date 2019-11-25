package com.example.jpa.Dao;

import com.example.jpa.entityPO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMapper extends JpaRepository<User,String> {

}
