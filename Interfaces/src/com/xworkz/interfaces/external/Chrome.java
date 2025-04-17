package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Browser;

public class Chrome implements Browser {

    @Override
    public void closeTab() {
        System.out.println("running closeTab in Browser");
    }

    @Override
    public void openTab() {
        System.out.println("Running openTab in Browser");
    }

    @Override
    public void refreshPage() {
        System.out.println("Running refreshPage in Browser");
    }

    @Override
    public void search() {
        System.out.println("Running search in Chrome");

    }
}
