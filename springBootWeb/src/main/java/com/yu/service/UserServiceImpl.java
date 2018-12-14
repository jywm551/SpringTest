package com.yu.service;

import com.yu.DTO.UserDTO;
import com.yu.dao.UserDao;
import com.yu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}
