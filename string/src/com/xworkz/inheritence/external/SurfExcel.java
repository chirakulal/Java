package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Detergent;

public class SurfExcel extends Detergent {
    private String type;
    private int weight;
    private boolean isForMachineWash;


    public SurfExcel(String type, int weight, boolean isForMachineWash) {
        this.type = type;
        this.weight = weight;
        this.isForMachineWash = isForMachineWash;
    }
    @Override
    public void removeStains() {
        System.out.println("Running removeStains in SurfExcel"); }
    @Override
    public void foamUp() {
        System.out.println("Running foamUP in SurfExcel"); }
    @Override
    public void smellGood() {
        System.out.println("Running smellGood in SurfExcel"); }
    @Override

    public void dissolve() {
        System.out.println("Running dissolve in SurfExcel"); }
    @Override
    public void cleanClothes() {
        System.out.println("Running cleanClothes in SurfExcel"); }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", isForMachineWash=" + isForMachineWash ;
    }
}
