package com.xworkz.inheritence.external;

public class English  {
    private String level;
    private String accent;
    private boolean isFluent;


    public English(String level, String accent, boolean isFluent) {
        this.level = level;
        this.accent = accent;
        this.isFluent = isFluent;
    }

    @Override
    public String toString() {
        return
                "level='" + level + '\'' +
                ", accent='" + accent + '\'' +
                ", isFluent=" + isFluent ;
    }

    @Override
    public int hashCode() {
        return 50;
    }
}
