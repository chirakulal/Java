package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.NavigationSystem;

public class GoogleMaps implements NavigationSystem {

    @Override
    public void reroute() {
        System.out.println("Running reroute in GoogleMaps");
    }

    @Override
    public void showMap() {
        System.out.println("Running showMap in GoogleMaps");

    }

    @Override
    public void setDestination() {
        System.out.println("Running setDestination in GoogleMaps");

    }
}
