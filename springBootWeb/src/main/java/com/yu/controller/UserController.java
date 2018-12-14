package com.yu.controller;

import com.yu.domain.User;
import com.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/findAll")
    public List<User> findAll() {
        List<User> all = userService.getAll();
        return all;
    }

}
