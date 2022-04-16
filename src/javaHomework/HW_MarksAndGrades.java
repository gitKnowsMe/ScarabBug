package javaHomework;


import java.util.Scanner;

public class HW_MarksAndGrades {
    public static void main(String[] args) {
        //Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
        //If marks are from 90 to 100 Print A
        //If marks are from 80 to 89 Print B
        //If marks are from 70 to 79 Print C
        //If marks are from 60 to 69 Print D
        //If marks are from 50 to 59 Print E
        //If marks are from 0 to 49 Print Fail
        System.out.println("Please enter your marks!");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score > 90 && score < 100) {
            System.out.println("Grade A");
        }else if ( score > 80 && score < 89 ){
            System.out.println("Grade B");
        }else if (score > 70 && score < 79) {
            System.out.println("Grade C");
        }else if (score > 60 && score <69 ){
            System.out.println("Grade D");
        }else if (score > 50 && score < 59) {
            System.out.println("Grade E");
        }else {
            System.out.println("Fail");

        }
    }
}
