package javaHomework;
// Make a program that will check the password

import java.util.Scanner;

public class HW_WhileLoop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "" , password = "";


        while (name.isEmpty()) {
            System.out.println("Please enter your name!" );
            name = sc.nextLine();
            System.out.println("Hello " +  name);
            System.out.println("Please enter the password");

            while (password.isEmpty() ){
                password = sc.nextLine();
                System.out.println(name + " your log in  was successful");
            }

        }

    }
}
