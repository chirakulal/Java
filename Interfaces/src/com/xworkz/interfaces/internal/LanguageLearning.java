package com.xworkz.interfaces.internal;

public interface LanguageLearning {

    void learnWord();
    void practiceQuiz();
    void checkProgress();
    default void takeTest(){
        System.out.println("Running taketest in LanguageLearning");
    }
}
