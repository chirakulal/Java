package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Shampoo;

public class CleanicPlus extends Shampoo {

    public CleanicPlus(){
        super();
        System.out.println("No-argument constructor is running in CleanicPlus");
    }
    @Override
    public void apply() {
        System.out.println("Running apply in CleanicPlus");
    }

    @Override
    public void rinse() {
        System.out.println("Running rinse in CleanicPlus");
    }

    @Override
    public void wash() {
        System.out.println("Running wash in CleanicPlus");
    }

    @Override
    public void clean() {
        System.out.println("Running clean in CleanicPlus");
    }

    @
    Override
    public void rub() {
        System.out.println("Running rub in CleanicPlus");
    }

}
