package com.chirashree.program;

public class ArmStrong {

    public static void main(String[] args) {

        int number=1634,originalNum,reminder,result=0,count=0;
        originalNum=number;

        while(originalNum>0){
            originalNum = originalNum/10;
            count++;
        }

        originalNum = number;

        while (originalNum>0){
            reminder = originalNum%10;
           result += (int)Math.pow(reminder,count);
            originalNum = originalNum/10;
        }

        if(result==number){
            System.out.println("It is a ArmStrong number");
        }
        else
            System.out.println("It is not an ArmStrong number");

    }
}
