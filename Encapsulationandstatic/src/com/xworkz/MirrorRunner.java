package com.xworkz;

import com.xworkz.encapsulation.Customer;
import com.xworkz.encapsulation.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new Mirror();
        Customer customer = new Customer();
        customer.reflection(mirror);
        System.out.println("---------------------------------");
        System.out.println(mirror.getShape());
        System.out.println(mirror.getPrice());

    }
}
