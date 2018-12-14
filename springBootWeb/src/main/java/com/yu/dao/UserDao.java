package com.yu.dao;

import com.yu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Yu On 2018/9/14
 * Description：
 **/
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
