package com.xworkz.inheritence.external;

public class Diamond {

    private double carat;
    private String colorGrade;
    private boolean isCertified;

    public Diamond(double carat, String colorGrade, boolean isCertified) {
        this.carat = carat;
        this.colorGrade = colorGrade;
        this.isCertified = isCertified;
    }

    @Override
    public String toString() {
        return
                "carat=" + carat +
                        ", colorGrade='" + colorGrade + '\'' +
                        ", isCertified=" + isCertified;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 46;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Diamond) {
                Diamond diamond1 = this;
                Diamond diamond2 = (Diamond) obj;
                if (diamond1.carat == diamond2.carat &&
                        diamond1.isCertified == diamond2.isCertified) {
                    System.out.println("Both diamonds are same based on carat and isCertified");
                    return true;
                }
            }
        }
        return false;
    }
}
