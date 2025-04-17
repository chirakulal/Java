package com.xworkz.interfaces.internal;

public interface BlogPlatform {

    void writePost();
    void publishPost();
    void deletePost();
    default void editPost(){
        System.out.println("Running editPost in BlogPlatform");
    }
}
