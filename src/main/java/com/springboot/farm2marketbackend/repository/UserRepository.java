package com.springboot.farm2marketbackend.repository;

import com.springboot.farm2marketbackend.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User getByUid(String uid);

    User findByPhonenumber(String phonenumber);
}


