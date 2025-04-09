package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.ProgrammingLanguage;

public class Java extends ProgrammingLanguage {
    private String version;
    private String developer;
    private boolean isObjectOriented;


    public Java(String version, String developer, boolean isObjectOriented) {
        this.version = version;
        this.developer = developer;
        this.isObjectOriented = isObjectOriented;
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

    @Override
    public String toString() {
        return
                "version='" + version + '\'' +
                ", developer='" + developer + '\'' +
                ", isObjectOriented=" + isObjectOriented ;
    }
}
