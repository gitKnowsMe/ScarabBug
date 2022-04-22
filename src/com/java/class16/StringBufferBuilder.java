package com.java.class16;

import java.util.Scanner;

public class StringBufferBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

        // String buffer uses the buffer mechanism to protect data from being
        // accessed and updated simultaneously, so its thread -safe
        StringBuffer sBuffer = new StringBuffer("Hello");


    }
}
