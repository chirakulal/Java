package com.xworkz.inheritence.external;

public class English {
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
                        ", isFluent=" + isFluent;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 50;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof English) {
                English english = (English) obj;
                if (this.level.equals(english.level) &&
                        this.accent.equals(english.accent)) {
                    System.out.println("Both English objects are same based on level and accent");
                    return true;
                }
            }
        }
        return false;
    }
}
