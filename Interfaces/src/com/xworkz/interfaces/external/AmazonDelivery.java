package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Delivery;

public class AmazonDelivery implements Delivery {

    @Override
    public void pickup() {
        System.out.println("Running pickup in AmazonDelivery");
    }

    @Override
    public void deliver() {
        System.out.println("Running deliver in AmazonDelivery");
    }

    @Override
    public void returnItem() {
        System.out.println("Running returnItem in AmazonDelivery");
    }

    @Override
    public void cancel() {
        System.out.println("Running cancel in Delivery");

    }
}
