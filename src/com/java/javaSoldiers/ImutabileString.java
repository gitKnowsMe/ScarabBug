package com.java.javaSoldiers;

public class ImutabileString {
    public static void main(String[] args) {

                       // String pool
        String name = "John";
        String anotherName ="Larry";
        String thirdName = new String("John");

        System.out.println( name == thirdName );
    }
}
