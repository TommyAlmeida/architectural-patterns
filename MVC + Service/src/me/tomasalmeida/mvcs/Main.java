package me.tomasalmeida.mvcs;

import me.tomasalmeida.mvcs.controller.UserController;
import me.tomasalmeida.mvcs.service.UserService;
import me.tomasalmeida.mvcs.service.UserServiceLocalImpl;
import me.tomasalmeida.mvcs.view.LoginView;
import me.tomasalmeida.mvcs.view.RegisterView;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceLocalImpl();
        UserController userController = new UserController(userService);

        RegisterView registerView = new RegisterView(userController);
        LoginView loginView = new LoginView(userController);

        registerView.show();

        System.out.println("============== Login ==============");
        loginView.show();
    }
}
