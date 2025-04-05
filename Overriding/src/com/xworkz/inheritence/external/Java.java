package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.ProgrammingLanguage;

public class Java extends ProgrammingLanguage {
    public Java() {
        super();
        System.out.println("No-arg constructor is running in Java");
    }
    @Override
    public void compile() {
        System.out.println("Running compile in Java");
    }

    @Override
    public void execute() {
        System.out.println("Running execute in Java");
    }


    @Override
    public void debug() {
        System.out.println("Running debug in Java");
    }

    @Override
    public void optimize() {
        System.out.println("Running optimize in Java");
    }

    @Override
    public void maintain() {
        System.out.println("Running maintain in Java");
    }

}
