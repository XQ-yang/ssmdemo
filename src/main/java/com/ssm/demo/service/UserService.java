package com.ssm.demo.service;

import com.ssm.demo.model.User;

import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/2 0002
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
public interface UserService {
    List<User> queryAll();

    User queryByName(String name);
}
