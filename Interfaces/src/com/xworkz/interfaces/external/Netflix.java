package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.Streaming;

public class Netflix implements Streaming {

    @Override
    public void playVideo() {
        System.out.println("Running playVideo in Netflix");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Running pauseVideo in Netflix");
    }

    @Override
    public void stopVideo() {
        System.out.println("Running stopVideo in Netflix");
    }

    @Override
    public void react() {
        System.out.println("Running deleteFiles in FileManager");

    }
}
