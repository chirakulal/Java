package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.VideoPlatform;

public class YouTube implements VideoPlatform {

    @Override
    public void uploadVideo() {
        System.out.println("Running uploadVideo in YouTube");
    }

    @Override
    public void likeVideo() {
        System.out.println("Running likeVideo in YouTube");
    }

    @Override
    public void commentVideo() {
        System.out.println("Running commentVideo in YouTube");
    }

    @Override
    public void delete() {
        System.out.println("Running delete in Youtube");

    }
}
