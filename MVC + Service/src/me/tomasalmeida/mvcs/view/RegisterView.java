package me.tomasalmeida.mvcs.view;

import me.tomasalmeida.mvcs.controller.UserController;

import java.util.Scanner;

public class RegisterView implements View{

    private UserController userController;

    public RegisterView(UserController userController) {
        this.userController = userController;
    }

    @Override
    public void show() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        boolean registerStatus = userController.register(username, password);

        if(registerStatus){
            System.out.println("User registered");
        }else{
            System.out.println("Couldn't register user");
        }
    }

}
