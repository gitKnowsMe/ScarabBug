package com.java.class10;

import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {

        int a = 10, b = 20, c = 0 ;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
