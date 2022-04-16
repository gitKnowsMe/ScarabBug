package com.java.Scrapbook;

public class String_hasBad {
    public static void main(String[] args) {
     String str = "";
            if(str.length()>=3 && (str.substring(0,3).equals("bad")) || str.length() >3 && (str.substring(1,4).equals("bad"))){
            System.out.println(true);
            }else{
                System.out.println(false);
            }


        }
}
