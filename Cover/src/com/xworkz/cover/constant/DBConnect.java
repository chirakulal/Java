package com.xworkz.cover.constant;

public enum DBConnect {
    URL("jdbc:mysql://localhost:3306/ko19rom"),
    USERNAME("root"),
    PASSWORD("Chir@#$123"),
    DRIVER("com.mysql.cj.jdbc.Driver");

    private String prop;

    DBConnect(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
