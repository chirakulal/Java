package com.xworkz.inheritence.external;

public class FireFox {
    private String version;
    private boolean isPrivateMode;
    private int installedExtensions;

    public FireFox(String version, boolean isPrivateMode, int installedExtensions) {
        this.version = version;
        this.isPrivateMode = isPrivateMode;
        this.installedExtensions = installedExtensions;
    }

    @Override
    public String toString() {
        return
                "version='" + version + '\'' +
                        ", isPrivateMode=" + isPrivateMode +
                        ", installedExtensions=" + installedExtensions;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 52;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof FireFox) {
                FireFox fireFox = (FireFox) obj;
                if (this.version.equals(fireFox.version) &&
                        this.isPrivateMode == fireFox.isPrivateMode) {
                    System.out.println("Both FireFox objects are same based on version and isPrivateMode");
                    return true;
                }
            }
        }
        return false;
    }
}
