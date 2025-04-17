package com.xworkz.interfaces.internal;

public interface LanguageTranslator {

    void translateToEnglish();
    void translateToHindi();
    void detectLanguage();

    default void translateToUrdu(){
        System.out.println("Running translateToUrdu");
    }
}
