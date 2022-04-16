package javaHomework;

import java.util.Scanner;

public class HW_Factorial01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int factorial = 1;

        for( int i = 1; i <= limit; i++  ) {
            factorial = factorial * i;
        }
            System.out.println(factorial);

    }
}
