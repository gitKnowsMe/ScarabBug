package javaHomework;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your number");

        int num = scan.nextInt();

        if (num == 0) {
            System.out.println("Number is Zero");
        } else if (num < 0) {
            System.out.println("negative");
        } else{
            System.out.println("Positive");
        }
    }

}