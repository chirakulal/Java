package com.chirashree.program;

public class PrimeNumber {


    public static void main(String[] args) {

        int number = 29;
        boolean isPrime=true;

        if (number== 0||number==1) {
            System.out.println("not a prime number");
        }
        else {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        if(isPrime){
            System.out.println("it is a prime");
        }
        else System.out.println("it is not a prime");

    }
}
