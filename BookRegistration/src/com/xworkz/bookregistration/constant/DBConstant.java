package com.xworkz.bookregistration.constant;

public enum DBConstant {
   Driver("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/ko19rom"),
    USERNAME("root"),
    PASSWORD("Chir@#$123")
    ;

    private String prop;

    DBConstant(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }
}
