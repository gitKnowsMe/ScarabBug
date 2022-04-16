package javaHomework;

import java.util.Scanner;

public class DaysInAGivenMonth {
    public static void main(String[] args) {
        System.out.println("Enter the month number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();


        if (num == 1) {
            System.out.println("31");
        } else if (num == 2) {
            System.out.println("28/29");
        } else if (num == 3) {
            System.out.println("31");
        } else if (num == 4) {
            System.out.println("30");
        } else if (num == 5) {
            System.out.println("31");
        }else if(num == 6 ) {
            System.out.println("30");
        }else if(num == 7 ) {
            System.out.println("31");
        }else if(num == 8) {
            System.out.println("30");
        }else if(num == 9) {
            System.out.println("31");
        }else if(num == 10) {
            System.out.println("30");
        }else if(num == 11){
            System.out.println("31");
        }
    }
}
