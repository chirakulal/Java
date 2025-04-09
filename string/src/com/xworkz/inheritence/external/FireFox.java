package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Browser;

public class FireFox extends Browser {
    private String version;
    private boolean isPrivateMode;
    private int installedExtensions;


    public FireFox(String version, boolean isPrivateMode, int installedExtensions) {
        this.version = version;
        this.isPrivateMode = isPrivateMode;
        this.installedExtensions = installedExtensions;
    }
    @Override
    public void open() {
        System.out.println("Running open in FireFox");
    }

    @Override
    public void close() {
        System.out.println("Running close in FireFox");
    }

    @Override
    public void navigate() {
        System.out.println("Running navigate in FireFox");
    }

    @Override
    public void incognitoMode() {
        System.out.println("Running incognitoMode in FireFox");
    }

    @Override
    public void extensions() {
        System.out.println("Running extensions in FireFox");
    }

    @Override
    public String toString() {
        return
                "version='" + version + '\'' +
                ", isPrivateMode=" + isPrivateMode +
                ", installedExtensions=" + installedExtensions ;
    }
}
