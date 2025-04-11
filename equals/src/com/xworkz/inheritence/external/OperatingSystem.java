package com.xworkz.inheritence.external;

public class OperatingSystem {
    private String name;
    private String version;
    private boolean isOpenSource;

    public OperatingSystem(String name, String version, boolean isOpenSource) {
        this.name = name;
        this.version = version;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", version='" + version + '\'' +
                        ", isOpenSource=" + isOpenSource;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 51;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof OperatingSystem) {
                OperatingSystem os = (OperatingSystem) obj;
                if (this.name.equals(os.name) &&
                        this.version.equals(os.version)) {
                    System.out.println("Both OperatingSystem objects are same based on name and version");
                    return true;
                }
            }
        }
        return false;
    }
}
