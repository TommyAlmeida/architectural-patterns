package me.tomasalmeida.mvcs.controller;

import me.tomasalmeida.mvcs.domain.User;
import me.tomasalmeida.mvcs.service.UserService;

public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public boolean register(String username, String password){
        return userService.register(new User(username, password));
    }

    public User login(String username, String password){
        return userService.login(username, password);
    }
}
