package com.xworkz.interfaces.internal;

public interface CodingPlatform {
    void submitCode();
    void viewLeaderboard();
    void runTestCases();

    default void compile(){
        System.out.println("Running compile in CodingPlatform");
    }
}
