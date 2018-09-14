package com.yu.service;

import com.yu.DTO.UserDTO;

import java.util.List;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
public interface UserService {
    UserDTO getUser(Integer id);

    List<UserDTO> findAll();

    UserDTO newUser(String name);
}
