package com.xworkz.interfaces.internal;

public interface CloudStorage {

    void uploadFile();
    void downloadFile();
    void deleteFile();

    default void restoreFile(){
        System.out.println("Running restoreFile in CloudStorage");
    }

}
