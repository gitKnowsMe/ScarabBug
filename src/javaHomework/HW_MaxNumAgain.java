package javaHomework;

import java.util.Scanner;

public class HW_MaxNumAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert 3 numbers!");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if ( num1 > num2 && num1 > num3) {
            System.out.println("Max number is " + num1 );
        }else if ( num2 > num3) {
            System.out.println( "Max number is " + num2 );
        }else{
            System.out.println("Max number is " + num3 );
        }
    }
}
