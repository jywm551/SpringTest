package com.yu.controller;

import com.yu.DTO.UserDTO;
import com.yu.domain.User;
import com.yu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getUser")
    public UserDTO getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/findAll")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @PostMapping("/newUser")
    public UserDTO newUser(@RequestParam String name) {
        return userService.newUser(name);
    }
}
