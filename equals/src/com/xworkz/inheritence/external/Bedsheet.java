package com.xworkz.inheritence.external;

public class Bedsheet  {

    private String material;
    private String size;
    private boolean isPrinted;

    public Bedsheet(String material, String size, boolean isPrinted) {
        this.material = material;
        this.size = size;
        this.isPrinted = isPrinted;
    }

    @Override
    public String toString() {
        return
                "material='" + material + '\'' +
                        ", size='" + size + '\'' +
                        ", isPrinted=" + isPrinted;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 66;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bedsheet) {
                Bedsheet bedsheet = (Bedsheet) obj;
                if (this.material.equals(bedsheet.material) &&
                        this.size.equals(bedsheet.size)) {
                    System.out.println("Both Bedsheet objects are same based on material and size");
                    return true;
                }
            }
        }
        return false;
    }
}
