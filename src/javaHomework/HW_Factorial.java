package javaHomework;

import java.util.Scanner;

public class HW_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in your factorial number");

        int fact = 1;
        int limit = sc.nextInt();
        for (int i = 1; i <= limit ; i++) {
            fact = fact * i ;

        }
        System.out.println("The result is " + fact);

    }
}

