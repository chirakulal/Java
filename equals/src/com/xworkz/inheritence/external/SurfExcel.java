package com.xworkz.inheritence.external;

public class SurfExcel {
    private String type;
    private int weight;
    private boolean isForMachineWash;

    public SurfExcel(String type, int weight, boolean isForMachineWash) {
        this.type = type;
        this.weight = weight;
        this.isForMachineWash = isForMachineWash;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                        ", weight=" + weight +
                        ", isForMachineWash=" + isForMachineWash;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 77;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SurfExcel) {
                SurfExcel other = (SurfExcel) obj;
                if (this.type.equals(other.type)) {
                    System.out.println("Both SurfExcel objects are same based on type");
                    return true;
                }
            }
        }
        return false;
    }
}
