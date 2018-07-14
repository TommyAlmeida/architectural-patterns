package me.tomasalmeida.mvcs.service;

import me.tomasalmeida.mvcs.domain.User;

public interface UserService {

    boolean register(User user);

    User login(String username, String password);

}
