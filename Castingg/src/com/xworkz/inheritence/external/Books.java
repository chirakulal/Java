package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Document;
import com.xworkz.inheritence.internal.Soap;

public class Books extends Document {
    public Books() {
        super();
        System.out.println("No-arg constructor is running in Book");
    }
    @Override
    public void open() {
        System.out.println("Running open in Books");
    }

    @Override
    public void read() {
        System.out.println("Running read in Books");
    }

    @Override
    public void write() {
        System.out.println("Running write in Books");
    }

    @Override
    public void save() {
        System.out.println("Running save in Books");
    }

    @Override
    public void print() {
        System.out.println("Running print in Books");
    }

    public void edit(){
        System.out.println("Running edit in Book");
    }

}
