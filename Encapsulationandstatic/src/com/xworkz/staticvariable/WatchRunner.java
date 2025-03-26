package com.xworkz.staticvariable;

public class WatchRunner {

    public static void main(String[] args) {

           Watch watch = new Watch();
           Watch.brand="titan";
           watch.setPrice(3000);

        System.out.println(watch.brand);
        System.out.println(watch.getPrice());
        System.out.println(Watch.brand);

        Watch watch1 = new Watch();

        System.out.println(watch1.brand);
        System.out.println(watch1.getPrice());
        System.out.println(Watch.brand);

        watch1.brand="Fasttrack";
        watch1.setPrice(4000);

        System.out.println(watch1.brand);
        System.out.println(watch1.getPrice());
        System.out.println(Watch.brand);

    }
}
