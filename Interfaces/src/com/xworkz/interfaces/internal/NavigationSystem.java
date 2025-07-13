package com.xworkz.interfaces.internal;

public interface NavigationSystem {

    void setDestination();
    void reroute();
    void showMap();

    default void setSource(){
        System.out.println("Running setSource in NavigationSystem");
    }
}
