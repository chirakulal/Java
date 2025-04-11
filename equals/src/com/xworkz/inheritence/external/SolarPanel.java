package com.xworkz.inheritence.external;

public class SolarPanel {
    private int wattage;
    private String manufacturer;
    private boolean isMonocrystalline;

    public SolarPanel(int wattage, String manufacturer, boolean isMonocrystalline) {
        this.wattage = wattage;
        this.manufacturer = manufacturer;
        this.isMonocrystalline = isMonocrystalline;
    }

    @Override
    public String toString() {
        return
                "wattage=" + wattage +
                        ", manufacturer='" + manufacturer + '\'' +
                        ", isMonocrystalline=" + isMonocrystalline;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 63;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SolarPanel) {
                SolarPanel solarPanel = (SolarPanel) obj;
                if (this.wattage == solarPanel.wattage &&
                        this.manufacturer.equals(solarPanel.manufacturer)) {
                    System.out.println("Both SolarPanel objects are same based on wattage and manufacturer");
                    return true;
                }
            }
        }
        return false;
    }
}
