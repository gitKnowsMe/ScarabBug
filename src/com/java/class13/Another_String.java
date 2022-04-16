package com.java.class13;

import java.util.Scanner;

public class Another_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello";
        String str2 = sc.nextLine();


        if (str1.equals(str2) ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    }

