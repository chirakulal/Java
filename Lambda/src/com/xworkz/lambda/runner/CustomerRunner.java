package com.xworkz.lambda.runner;

import com.xworkz.lambda.internal.Bottle;
import com.xworkz.lambda.internal.Customer;

public class CustomerRunner {


    public static void main(String[] args) {


//        Bottle bottle = (int no)->{
//            System.out.println("Number "+no);
//            if(no>0)
//            {
//                return true;
//            }
//            return false;
//        };

        Customer customer = new Customer();
        customer.buy((no)->(no>100));
    }
}
