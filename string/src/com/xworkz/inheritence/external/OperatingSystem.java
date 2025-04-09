package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Software;

public class OperatingSystem extends Software {
    private String name;
    private String version;
    private boolean isOpenSource;


    public OperatingSystem(String name, String version, boolean isOpenSource) {
        this.name = name;
        this.version = version;
        this.isOpenSource = isOpenSource;
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

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", isOpenSource=" + isOpenSource ;
    }
}
