package com.ssm.demo.service.impl;

import com.ssm.demo.dao.UserDao;
import com.ssm.demo.model.User;
import com.ssm.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/2 0002
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public User queryByName(String name) {
        return userDao.queryByName(name);
    }
}
