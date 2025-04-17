package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.CodingPlatform;

public class HackerRank implements CodingPlatform {

    @Override
    public void submitCode() {
        System.out.println("Running submitCode in HackerRank");
    }

    @Override
    public void viewLeaderboard() {
        System.out.println("Running viewLeaderboard in HackerRank");
    }

    @Override
    public void runTestCases() {
        System.out.println("Running runTestCases in HackerRank");
    }
}
