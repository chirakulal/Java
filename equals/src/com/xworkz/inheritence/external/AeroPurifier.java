package com.xworkz.inheritence.external;

public class AeroPurifier {

    private String version;
    private int coverageArea;
    private boolean ozoneSafe;

    public AeroPurifier(String version, int coverageArea, boolean ozoneSafe) {
        this.version = version;
        this.coverageArea = coverageArea;
        this.ozoneSafe = ozoneSafe;
    }

    @Override
    public String toString() {
        return "version='" + version + '\'' +
                ", coverageArea=" + coverageArea +
                ", ozoneSafe=" + ozoneSafe;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof AeroPurifier) {
                AeroPurifier other = (AeroPurifier) obj;
                if (this.version.equals(other.version)) {
                    System.out.println("Both AeroPurifier objects are same based on version");
                    return true;
                }
            }
        }
        return false;
    }
}
