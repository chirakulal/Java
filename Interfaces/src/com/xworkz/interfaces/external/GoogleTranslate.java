package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.LanguageTranslator;

public class GoogleTranslate  implements LanguageTranslator {
    @Override
    public void translateToEnglish() {
        System.out.println("Running translateToEnglish in GoogleTranslate");
    }

    @Override
    public void translateToHindi() {
        System.out.println("Running translateToHindi in GoogleTranslate");
    }

    @Override
    public void detectLanguage() {
        System.out.println("Running detectLanguage in GoogleTranslate");
    }
}
