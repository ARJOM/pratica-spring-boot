package com.practice.practice.dao;

import com.practice.practice.model.User;

import java.util.HashSet;
import java.util.Set;

public class UserDao {
    private Set<User> users;

    public UserDao() {
        this.users = new HashSet<>();
    }

    public Set<User> index(){
        return users;
    }

    public boolean save(User user){
        return users.add(user);
    }

    public boolean remove(User user){
        return users.remove(user);
    }

    public User getByEmail(String email){
        return users.stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst().orElse(null);
    }
}
