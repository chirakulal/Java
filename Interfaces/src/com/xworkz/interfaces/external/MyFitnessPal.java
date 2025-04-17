package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.FitnessApp;

public class MyFitnessPal implements FitnessApp {

    @Override
    public void startWorkout() {
        System.out.println("Running startWorkout in MyFitnessPal");
    }

    @Override
    public void trackCalories() {
        System.out.println("Running trackCalories in MyFitnessPal");
    }

    @Override
    public void setGoal() {
        System.out.println("Running setGoal in MyFitnessPal");
    }
}
