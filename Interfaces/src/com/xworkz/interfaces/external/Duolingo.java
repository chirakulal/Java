package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.LanguageLearning;

public class Duolingo implements LanguageLearning {

    @Override
    public void learnWord() {
        System.out.println("Running learnWord in Duolingo");
    }

    @Override
    public void practiceQuiz() {
        System.out.println("Running practiceQuiz in Duolingo");
    }

    @Override
    public void checkProgress() {
        System.out.println("Running checkProgress in Duolingo");
    }

    @Override
    public void takeTest() {
        System.out.println("Running taketest in Duolinga");

    }
}
