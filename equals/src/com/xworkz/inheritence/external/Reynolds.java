package com.xworkz.inheritence.external;

public class Reynolds {
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
        return "penType='" + penType + '\'' +
                ", inkColor='" + inkColor + '\'' +
                ", isRefillable=" + isRefillable;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Reynolds) {
                Reynolds other = (Reynolds) obj;
                if (this.penType.equals(other.penType)) {
                    System.out.println("Both Reynolds objects are same based on penType");
                    return true;
                }
            }
        }
        return false;
    }
}
