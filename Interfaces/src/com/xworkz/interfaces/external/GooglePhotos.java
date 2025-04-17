package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.PhotoGallery;

public class GooglePhotos implements PhotoGallery {

    @Override
    public void viewPhotos() {
        System.out.println("Running viewPhotos in GooglePhotos");
    }

    @Override
    public void deletePhotos() {
        System.out.println("Running deletePhotos in GooglePhotos");
    }

    @Override
    public void editPhotos() {
        System.out.println("Running editPhotos in GooglePhotos");
    }

    @Override
    public void restore() {
        System.out.println("Running restore in PhotoGallery");

    }
}
