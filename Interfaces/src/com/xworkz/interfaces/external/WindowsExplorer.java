package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.FileManager;

public class WindowsExplorer implements FileManager {

    @Override
    public void createFile() {
        System.out.println("Running createFile in WindowsExplorer");
    }

    @Override
    public void openFile() {
        System.out.println("Running openFile in WindowsExplorer");
    }

    @Override
    public void closeFile() {
        System.out.println("Running closeFile in WindowsExplorer");
    }

    @Override
    public void deleteFiles() {
        System.out.println("Running deleteFiles in FileManager");

    }
}
