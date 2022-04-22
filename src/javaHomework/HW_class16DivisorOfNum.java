package javaHomework;

import java.util.Scanner;

public class HW_class16DivisorOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Find divisor of given number (Input - 6, output will be 1 2 3 6)
        System.out.println("Enter a number!");
        int num = sc.nextInt();
        int divNum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }

        }
    }
}