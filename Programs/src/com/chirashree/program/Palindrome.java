package com.chirashree.program;

public class Palindrome {

    public static void main(String[] args) {
        int number=122,reminder,result=0;
        int temp=number;

        while(temp>0){
            reminder = temp%10;
            result = result*10+reminder;
            temp = temp/10;
        }

        if(result==number){
            System.out.println("It is a palindrome");
        }
        else System.out.println("It is not a palindrome");
    }
}
