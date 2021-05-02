package com.ssm.demo.dao;

import com.ssm.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/2 0002
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Repository
public interface UserDao {
    List<User> queryAll();

    User queryByName(String name);
}
