package com.java.class07;

import java.util.Scanner;

public class HomeworkUsernamePassword7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your username!");
        String username = sc.nextLine();
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("123")){
            System.out.println("You're logged in successfully !");
        }else if (username.equals("admin")) {
            System.out.println("Invalid password!");
        }else if ( password.equals ("123")){
             System.out.println("Invalid username!");
            }else{
                System.out.println("Log in unsuccessful!");
            }

        }
    }

