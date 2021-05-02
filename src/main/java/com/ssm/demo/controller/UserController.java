package com.ssm.demo.controller;

import com.ssm.demo.model.User;
import com.ssm.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: XQ-Yang
 * @Date: 2021/5/2 0002
 * @Tools: IntelliJ IDEA
 * @Remember: Be professional every day
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model){
        List<User> users = userService.queryAll();
        for (User user:users) {
            System.out.println("id:"+ user.getId());
            System.out.println("name:"+ user.getName());
            System.out.println("password:"+ user.getPassword());
        }
        return "hello";
    }

    @RequestMapping("/queryByName/{name}")
    public String queryByName(@PathVariable("name") String name){
        User user = userService.queryByName(name);
        System.out.println("id:"+ user.getId());
        System.out.println("name:"+ user.getName());
        System.out.println("password:"+ user.getPassword());
        return "hello";
    }
}
