package com.springboot.mydemo;

import com.springboot.mydemo.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootdemoApplicationTests {

    @Autowired
    MyService myService;

    @Test
    public void contextLoads() {
        myService.find();
    }

}
