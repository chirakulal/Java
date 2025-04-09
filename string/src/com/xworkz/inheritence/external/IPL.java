package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Tournament;

public class IPL extends Tournament {

    private String teamName;
    private String captain;
    private int totalWins;


    public IPL(String teamName, String captain, int totalWins) {
        this.teamName = teamName;
        this.captain = captain;
        this.totalWins = totalWins;
    }
    public void organize() {
        System.out.println("IPL is organized for competitive matches");
    }

    public void teamsParticipate() {
        System.out.println("Multiple teams participate in the IPL");
    }

    public void scheduleMatches() {
        System.out.println("Matches are scheduled across different IPL");
    }

    public void declareWinner() {
        System.out.println("IPL declares a winner at the end");
    }

    public void entertainFans() {
        System.out.println("IPL provides entertainment for sports fans");
    }

    @Override
    public String toString() {
        return
                "teamName='" + teamName + '\'' +
                ", captain='" + captain + '\'' +
                ", totalWins=" + totalWins ;
    }
}
