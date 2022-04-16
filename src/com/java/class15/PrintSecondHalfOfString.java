package com.java.class15;

import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        System.out.println(str1.substring((str1.length()/ 2 )));

        if (str1.length() %2 ==0) {
            System.out.println(str1.substring(str1.length()/2));
        }else{
            System.out.println(str1.substring(str1.length() / 2));
        }
    }
}
