package com.xworkz.inheritence.external;

public class Kindle {
    private String model;
    private int storageCapacity;
    private boolean isBacklit;

    public Kindle(String model, int storageCapacity, boolean isBacklit) {
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.isBacklit = isBacklit;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                        ", storageCapacity=" + storageCapacity +
                        ", isBacklit=" + isBacklit;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Kindle) {
                Kindle other = (Kindle) obj;
                if (this.model.equals(other.model)) {
                    System.out.println("Both Kindle objects are same based on model");
                    return true;
                }
            }
        }
        return false;
    }
}
