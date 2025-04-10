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
        return 100;
    }

}
