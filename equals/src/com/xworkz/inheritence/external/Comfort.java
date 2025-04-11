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
                        ", isPeacefulEnvironment=" + isPeacefulEnvironment;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 73;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Comfort) {
                Comfort comfort = (Comfort) obj;
                if (this.level.equals(comfort.level)) {
                    System.out.println("Both Comfort objects are same based on level");
                    return true;
                }
            }
        }
        return false;
    }
}
