package com.xworkz.inheritence.external;


public class IPL {

    private String teamName;
    private String captain;
    private int totalWins;


    public IPL(String teamName, String captain, int totalWins) {
        this.teamName = teamName;
        this.captain = captain;
        this.totalWins = totalWins;
    }

    @Override
    public String toString() {
        return
                "teamName='" + teamName + '\'' +
                ", captain='" + captain + '\'' +
                ", totalWins=" + totalWins ;
    }

    @Override
    public int hashCode() {
        return 59;
    }
}
