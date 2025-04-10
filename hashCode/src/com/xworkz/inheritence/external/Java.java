package com.xworkz.inheritence.external;


public class Java  {
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
                ", isObjectOriented=" + isObjectOriented ;
    }

    @Override
    public int hashCode() {
        return 65;
    }
}
