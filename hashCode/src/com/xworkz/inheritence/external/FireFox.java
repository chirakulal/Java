package com.xworkz.inheritence.external;


public class FireFox  {
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
                ", installedExtensions=" + installedExtensions ;
    }

    @Override
    public int hashCode() {
        return 52;
    }
}
