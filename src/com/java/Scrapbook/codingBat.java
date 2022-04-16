package com.java.Scrapbook;

import java.util.Scanner;

public class codingBat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            System.out.println(str.charAt(0) + str.substring(4));
        }else{
        // Otherwise return the original string.
        System.out.println(str);
    }
    }
    }
