package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.CloudStorage;

public class GoogleDrive implements CloudStorage {

    @Override
    public void deleteFile() {
        System.out.println("Running DeleteFile in GoogleDrive");
    }

    @Override
    public void downloadFile() {
        System.out.println("Running downlaodFile in GoogleDrive");
    }

    @Override
    public void uploadFile() {
        System.out.println("Running uploadFile inGoogleDrive");
    }

    @Override
    public void restoreFile() {
        System.out.println("running restoreFile in GoogleDrive");
    }
}
