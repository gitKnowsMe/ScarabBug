package javaHomework;


import java.util.Scanner;

public class HW03_Class11 {
    public static void main(String[] args) {
        System.out.println("Please enter a number!");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int num = 1;

        while (num < limit ){
            if ( num % 3 != 0 && num % 7 == 0 )
            System.out.println( num + " is not divisible by 3 but it is divisible by 7 ");
        num++;
        }
    }
}
