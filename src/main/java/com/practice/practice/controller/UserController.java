package com.practice.practice.controller;

import com.practice.practice.dao.UserDao;
import com.practice.practice.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
public class UserController {

    private UserDao userDao = new UserDao();

    @GetMapping("/users")
    public Set<User> list(){
        return userDao.index();
    }

    @PostMapping("/users")
    public User create(@RequestBody User user){
        userDao.save(user);
        return user;
    }
}
