package me.tomasalmeida.mvcs.view;

import me.tomasalmeida.mvcs.controller.UserController;
import me.tomasalmeida.mvcs.domain.User;

import java.util.Scanner;

public class LoginView implements View{

    private UserController userController;

    public LoginView(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        User user = userController.login(username, password);

        if(user != null){
            System.out.println("Welcome @" + user.getUsername());
        }
    }

}
