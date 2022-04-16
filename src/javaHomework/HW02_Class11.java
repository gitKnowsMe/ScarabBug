package javaHomework;

import java.util.Scanner;

/* Write a program that will print number that will be divisible by 3 or 5, 1 to 5

 */
public class HW02_Class11 {
    public static void main(String[] args) {

        int limit = 50;
        int num = 1;

        while (num < limit) {
            num++;
            if (num % 3 == 0 || num % 5 == 0) {
                System.out.println(num);
            }
        }
    }
}
