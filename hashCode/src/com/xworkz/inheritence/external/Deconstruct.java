package com.xworkz.inheritence.external;

public class Deconstruct  {

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
                ", isRecyclable=" + isRecyclable ;
    }

    @Override
    public int hashCode() {
        return 71;
    }
}
