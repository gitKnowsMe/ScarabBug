package com.java.Scrapbook;

import java.util.Scanner;

public class Stuff {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String username = "Eugene";
            String password = "123";
            System.out.println("Enter the username");
            String userInput = sc.nextLine();
            System.out.println("Enter the password");
            String passwordInput = sc.nextLine();

            if (username.equals(userInput) && password.equals(passwordInput)) {
                System.out.println("Login successful");
            }else{
                System.out.println("Incorrect username or password");
            }
        }
    }

