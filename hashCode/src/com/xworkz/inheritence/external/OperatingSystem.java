package com.xworkz.inheritence.external;


public class OperatingSystem {
    private String name;
    private String version;
    private boolean isOpenSource;


    public OperatingSystem(String name, String version, boolean isOpenSource) {
        this.name = name;
        this.version = version;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", isOpenSource=" + isOpenSource ;
    }

    @Override
    public int hashCode() {
        return 51;
    }
}
