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
                        ", totalWins=" + totalWins;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent : " + super.hashCode());
        return 59;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof IPL) {
                IPL ipl = (IPL) obj;
                if (this.teamName.equals(ipl.teamName)
                        && this.captain.equals(ipl.captain)) {
                    System.out.println("Both IPL objects are same based on teamName and captain");
                    return true;
                }
            }
        }
        return false;
    }
}
