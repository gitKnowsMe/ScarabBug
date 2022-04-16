package com.java.class15;

import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String parts[] = fullName.split(" ");

        String firstName = parts[0];
        String lastName = parts[2];

        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0) + ".");

    }
}


