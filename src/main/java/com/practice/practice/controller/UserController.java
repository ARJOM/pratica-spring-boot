package com.practice.practice.controller;

import com.practice.practice.dao.UserDao;
import com.practice.practice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;


@RestController
public class UserController {

    private UserDao userDao = new UserDao();

    @GetMapping("/users")
    public Set<User> list(){
        return userDao.index();
    }

}
