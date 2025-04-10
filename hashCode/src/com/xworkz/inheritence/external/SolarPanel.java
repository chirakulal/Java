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
        return 63;
    }
}
