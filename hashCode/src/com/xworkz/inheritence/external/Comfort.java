package com.xworkz.inheritence.external;


public class Comfort {
    private String level;
    private double temperature;
    private boolean isPeacefulEnvironment;


    public Comfort(String level, double temperature, boolean isPeacefulEnvironment) {
        this.level = level;
        this.temperature = temperature;
        this.isPeacefulEnvironment = isPeacefulEnvironment;
    }

    @Override
    public String toString() {
        return
                "level='" + level + '\'' +
                ", temperature=" + temperature +
                ", isPeacefulEnvironment=" + isPeacefulEnvironment ;
    }

    @Override
    public int hashCode() {
        return 73;
    }
}
