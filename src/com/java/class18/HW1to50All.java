package com.java.class18;

public class HW1to50All {
    public static void main(String[] args) {
        int num = 50;

        for (int i = 1; i <= num; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);

            }
        }
    }

    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) {
                count++;
            }
        }
        if(count ==2){
                return true;
            } else {
                return false;
            }
        }
    }

