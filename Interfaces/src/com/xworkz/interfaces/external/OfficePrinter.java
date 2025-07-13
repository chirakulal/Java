package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Printer;

public class OfficePrinter implements Printer {

    @Override
    public void copy() {
        System.out.println("Running copy in OfficePrinter");
    }

    @Override
    public void print() {
        System.out.println("Running print in OfficePrinter");

    }

    @Override
    public void scan() {
        System.out.println("Running scan in OfficePrinter");

    }

    @Override
    public void edit() {
        System.out.println("running edit in OfficePrinter");
    }
}
