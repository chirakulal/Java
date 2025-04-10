package com.xworkz.inheritence.external;

public class Coffee  {

    private String type;
    private String size;
    private boolean hasSugar;

    public Coffee(String type, String size, boolean hasSugar) {
        this.type = type;
        this.size = size;
        this.hasSugar = hasSugar;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", hasSugar=" + hasSugar;
    }

    @Override
    public int hashCode() {
        return 36;
    }
}
