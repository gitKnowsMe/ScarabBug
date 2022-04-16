package javaHomework;

import java.util.Scanner;

public class HW_Class12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in a number");
        int limit = sc.nextInt();

        int factorialNum = 1;

        for ( int i = 1; i <= limit; i++){
            factorialNum = factorialNum * i;

            System.out.println(factorialNum);
        }
    }
}
