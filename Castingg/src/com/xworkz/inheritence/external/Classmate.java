package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Notebook;

public class Classmate extends Notebook {
    public Classmate() {
        super();
        System.out.println("No-arg constructor in Classmate");
    }
    public void writeNotes() {
        System.out.println("Running writeNotes in Classmate");
    }
    public void tearPage() {
        System.out.println("Running tearPage in Classmate");
    }
    public void staplePages() {
        System.out.println("Running staplePages in Classmate");
    }
    public void decorate() {
        System.out.println("Running decorate in Classmate");
    }
    public void label() {
        System.out.println("Running label in Classmate");
    }
}
