package javaHomework;

import java.util.Scanner;

public class HW_TShirtSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your size");

        int size = sc.nextInt();

        if (size >= 27 && size <= 30) {
            System.out.println("XS");
        }else if (size <= 34) {
            System.out.println("S");
        }else if(size <= 38){
            System.out.println("L");
        }else if (size <= 42){
            System.out.println("XL");
        }else if (size <= 45){
            System.out.println("XXL");
        }else{
            System.out.println("You entered wrong size");
        }
    }

}
