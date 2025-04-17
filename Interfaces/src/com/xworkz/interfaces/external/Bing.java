package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.SearchEngine;

public class Bing implements SearchEngine {

    @Override
    public void searchQuery() {
        System.out.println("Running searchQuery in Bing");
    }

    @Override
    public void displayResults() {
        System.out.println("Running displayResults in Bing");
    }

    @Override
    public void filterResults() {
        System.out.println("Running filterResults in Bing");
    }
}
