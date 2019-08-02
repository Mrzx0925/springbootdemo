package com.springboot.mydemo.controller;

import com.springboot.mydemo.entity.Data;
import com.springboot.mydemo.entity.User;
import com.springboot.mydemo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
public class MyUserController {

    @Autowired
    UserRespository userRespository;


    @GetMapping("/age")
    public Data queryData(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Data data = new Data();
        List<User> users = userRespository.findAll();
        System.out.println(users);
        for (int i = 0; i < users.size(); i++) {
            int age = users.get(i).getAge();
            if (age > 0 && age < 20) {
                data.addone();
            } else if (age > 20 && age <= 40) {
                data.addtwo();
            } else if (age > 40 && age <= 60) {
                data.addthree();
            } else if (age > 60 && age <= 80) {
                data.addfour();
            } else if (age > 80 && age <= 100) {
                data.addfive();
            }
        }
        return data;


    }

    @PostMapping("/age/{age}")
    public void insertAge(HttpServletResponse response, @PathVariable("age") Integer age){
        response.setHeader("Access-Control-Allow-Origin", "*");
        User user = new User();
        user.setAge(age);
        userRespository.save(user);
    }
}
