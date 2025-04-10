package com.xworkz.inheritence.external;


public class HardDisk {
    private String capacity;
    private String type;
    private boolean isExternal;

    public HardDisk(String capacity, String type, boolean isExternal) {
        this.capacity = capacity;
        this.type = type;
        this.isExternal = isExternal;
    }
    @Override
    public String toString() {
        return
                "capacity='" + capacity + '\'' +
                        ", type='" + type + '\'' +
                        ", isExternal=" + isExternal;
    }

    @Override
    public int hashCode() {
        return 27;
    }
}
