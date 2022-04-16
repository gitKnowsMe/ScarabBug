package com.java.class06;
import java.util.Scanner;

public class LadderIfElseExample {
    public static void main(String[] args) {
        System.out.println("enter any number from 0 to 6");
        Scanner scan=new Scanner(System.in);
        int dayNum = scan.nextInt();

        if (dayNum == 0) {
            System.out.println("Sun" );
        }else if(dayNum ==1){
            System.out.println("Mon");
        }else if(dayNum == 2){
            System.out.println("Tue");
        }else if(dayNum == 3){
            System.out.println("Wed");
        }else if(dayNum == 4){
            System.out.println("Thurs");
        }else if(dayNum == 5){
            System.out.println("Fri");
        }else if(dayNum == 6){
            System.out.println("Sat");
        }
    }

}
