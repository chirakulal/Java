package com.xworkz.inheritence.external;



public class Reynolds  {
    private String penType;
    private String inkColor;
    private boolean isRefillable;


    public Reynolds(String penType, String inkColor, boolean isRefillable) {
        this.penType = penType;
        this.inkColor = inkColor;
        this.isRefillable = isRefillable;
    }

    @Override
    public String toString() {
        return
                "penType='" + penType + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", isRefillable=" + isRefillable ;
    }

    @Override
    public int hashCode() {
        return 85;
    }
}
