package com.demo.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.demo.service.*;
import com.demo.domain.*;

/**
 * Created by nickzhang on 2016/9/1.
 */
@RestController
//@SpringBootApplication
public class UserController {

    //private static final Logger logger = LoggerFactory.getLogger(SpringBootJDBCTest.class);

    @Autowired
    private UserService userInfoService;

    @RequestMapping("/user")
    public List<User> query(){
        
        return userInfoService.query();
    }

    
}
