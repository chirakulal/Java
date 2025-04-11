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
        System.out.println("Parent :" + super.hashCode());
        return 27;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof HardDisk) {
                HardDisk hardDisk = this;
                HardDisk hardDisk1 = (HardDisk) obj;
                if (hardDisk.capacity.equals(hardDisk1.capacity) &&
                        hardDisk.type.equals(hardDisk1.type) &&
                        hardDisk.isExternal == hardDisk1.isExternal) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
