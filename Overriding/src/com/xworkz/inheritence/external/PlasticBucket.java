package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Bucket;

public class PlasticBucket extends Bucket {
    public PlasticBucket() {
        super();
        System.out.println("No-arg constructor in PlasticBucket");
    }

    @Override
    public void fillWater() {
        System.out.println("Running fillWater in PlasticBucket");
    }
    @Override
    public void empty() {
        System.out.println("Running empty in PlasticBucket");
    }
    @Override
    public void carry() {
        System.out.println("Running carry in PlasticBucket");
    }
    @Override
    public void clean() {
        System.out.println("Running clean in PlasticBucket");
    }
    @Override
    public void store() {
        System.out.println("Running store in PlasticBucket");
    }
}
