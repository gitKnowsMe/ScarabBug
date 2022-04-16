package javaHomework;

import java.util.Scanner;

public class Practice_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number.");

        int limit = sc.nextInt();
        int factNum = 1;


        for (int i = 1; i <= limit; i++) {
            factNum = factNum * i;
            System.out.println(factNum);

        }

    }
}