package me.tomasalmeida.mvcs.service;

import me.tomasalmeida.mvcs.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceLocalImpl implements UserService {

    private Map<String, User> users;

    public UserServiceLocalImpl(){
        users = new HashMap<>();
    }

    @Override
    public boolean register(User user) {
        if(users.containsKey(user.getUsername())){
            return false;
        }

        users.put(user.getUsername(), user);
        return true;
    }

    @Override
    public User login(String username, String password) {
        User user = users.get(username);

        if(user.getPassword().equalsIgnoreCase(password)){
            return user;
        }

        return null;
    }
}
