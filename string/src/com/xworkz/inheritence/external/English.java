package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Language;

public class English extends Language {
    private String level;
    private String accent;
    private boolean isFluent;


    public English(String level, String accent, boolean isFluent) {
        this.level = level;
        this.accent = accent;
        this.isFluent = isFluent;
    }
    @Override
    public void speak() {
        System.out.println("Running speak in English");
    }

    @Override
    public void write() {
        System.out.println("Running write in English");
    }

    @Override
    public void read() {
        System.out.println("Running read in English");
    }

    @Override
    public void translate() {
        System.out.println("Running translate in English");
    }

    @Override
    public void learn() {
        System.out.println("Running learn in English");
    }

    public void speech(){
        System.out.println("Running speech in English");
    }

    @Override
    public String toString() {
        return
                "level='" + level + '\'' +
                ", accent='" + accent + '\'' +
                ", isFluent=" + isFluent ;
    }
}
