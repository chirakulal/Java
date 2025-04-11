package com.xworkz.inheritence.external;

public class Java {
    private String version;
    private String developer;
    private boolean isObjectOriented;

    public Java(String version, String developer, boolean isObjectOriented) {
        this.version = version;
        this.developer = developer;
        this.isObjectOriented = isObjectOriented;
    }

    @Override
    public String toString() {
        return
                "version='" + version + '\'' +
                        ", developer='" + developer + '\'' +
                        ", isObjectOriented=" + isObjectOriented;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 65;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Java) {
                Java java = (Java) obj;
                if (this.version.equals(java.version) &&
                        this.developer.equals(java.developer)) {
                    System.out.println("Both Java objects are same based on version and developer");
                    return true;
                }
            }
        }
        return false;
    }
}
