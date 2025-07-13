package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.PhotoEditor;

public class Snapseed  implements PhotoEditor {

    @Override
    public void crop() {
        System.out.println("Running crop in Snapseed");
    }

    @Override
    public void filter() {
        System.out.println("Running filter in Snapseed");
    }

    @Override
    public void save() {
        System.out.println("Running save in Snapseed");
    }

    @Override
    public void delete() {
        System.out.println("Running delete in Snaspeed");

    }
}
