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
                ", isForMachineWash=" + isForMachineWash ;
    }
    @Override
    public int hashCode() {
        return 77;
    }


}
