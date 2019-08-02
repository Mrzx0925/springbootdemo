package com.springboot.mydemo.service;

import com.springboot.mydemo.entity.User;
import com.springboot.mydemo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    @Autowired
    UserRespository userRespository;

    public  void find() {
        List<User> users = userRespository.findAll();
        System.out.println(users);
    }
}
