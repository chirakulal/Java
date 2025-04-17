package com.xworkz.interfaces.internal;

public interface FileManager {

    void createFile();
    void openFile();
    void closeFile();

    default void deleteFiles(){
        System.out.println("Running deleteFiles in FileManager");
    }
}
