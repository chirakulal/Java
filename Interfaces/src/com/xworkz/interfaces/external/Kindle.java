package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.EBookReader;

public class Kindle implements EBookReader {

    @Override
    public void openBook() {
        System.out.println("Running Kindle in EBookReader");
    }

    @Override
    public void bookmarkPage() {
        System.out.println("Running bookmarkPage in EBOOk");
    }

    @Override
    public void closeBook() {
        System.out.println("Running closeBook in EBookReader");
    }
}
