package javaHomework;

import java.util.Scanner;

public class HW_StringWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name ="";


        while (name.isEmpty()) {
            System.out.println("Please enter your name!");
            name = sc.nextLine();
        }
            System.out.println("Hello " + name);
    }
}