package com.java.class10;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        int a = 10, b = 10;
        int c;
        a = a + b;
        b = a - b;
        a = a - b;
        // Or multiplication
        a = a * b;
        b = a / b;
        a = a / b;

    }
}
