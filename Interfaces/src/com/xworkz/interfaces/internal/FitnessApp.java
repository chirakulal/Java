package com.xworkz.interfaces.internal;

public interface FitnessApp {
    void startWorkout();
    void trackCalories();
    void setGoal();

    default void dietChart(){
        System.out.println("Running dietChart in FitnessApp");
    }
}
