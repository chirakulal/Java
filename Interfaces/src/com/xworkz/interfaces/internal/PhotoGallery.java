package com.xworkz.interfaces.internal;

public interface PhotoGallery {

    void viewPhotos();
    void deletePhotos();
    void editPhotos();

    default void restore(){
        System.out.println("Running restore in PhotoGallery");
    }
}
