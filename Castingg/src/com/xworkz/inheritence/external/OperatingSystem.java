package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Software;

public class OperatingSystem extends Software {
    public OperatingSystem() {
        super();
        System.out.println("No-arg constructor is running in OperatingSystem");
    }
    @Override
    public void install() {
        System.out.println("Running install in OperatingSystem");
    }

    @Override
    public void run() {
        System.out.println("Running run in OperatingSystem");
    }

    @Override
    public void update() {
        System.out.println("Running update in OperatingSystem");
    }

    @Override
    public void uninstall() {
        System.out.println("Running uninstall in OperatingSystem");
    }

    @Override
    public void configure() {
        System.out.println("Running configure in OperatingSystem");
    }

}
