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
    public UserDTO getUser(Integer id) {
        User one = userDao.getOne(id);
        return toUserDTO(one);
    }

    @Override
    public List<UserDTO> findAll() {
        return userDao.findAll().stream().map(this::toUserDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO newUser(String name) {
        User user = userDao.findByName(name);
        if (user == null) {
            user = new User();
            user.setName(name);
            userDao.save(user);
        }
        return toUserDTO(user);
    }

    private UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        return userDTO;
    }
}
