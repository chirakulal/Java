package com.xworkz.staticvariable;

public class Watch {

        public static String brand;

        private int price;

        public Watch()
        {
            System.out.println("no-argu const is running");

        }

        public int getPrice(){
            return this.price;
        }
        public void setPrice(int price){
            this.price=price;
        }



}
