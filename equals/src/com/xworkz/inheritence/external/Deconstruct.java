package com.xworkz.inheritence.external;

public class Deconstruct {

    private String structureName;
    private String toolsUsed;
    private boolean isRecyclable;

    public Deconstruct(String structureName, String toolsUsed, boolean isRecyclable) {
        this.structureName = structureName;
        this.toolsUsed = toolsUsed;
        this.isRecyclable = isRecyclable;
    }

    @Override
    public String toString() {
        return
                "structureName='" + structureName + '\'' +
                        ", toolsUsed='" + toolsUsed + '\'' +
                        ", isRecyclable=" + isRecyclable;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 71;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Deconstruct) {
                Deconstruct deconstruct = (Deconstruct) obj;
                if (this.structureName.equals(deconstruct.structureName)) {
                    System.out.println("Both Deconstruct objects are same based on structureName");
                    return true;
                }
            }
        }
        return false;
    }
}
