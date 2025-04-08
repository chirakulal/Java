package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.English;
import com.xworkz.inheritence.internal.Language;

public class Kannada {

    public void talk(Language language){
        language.write();
        language.learn();
        language.read();
        language.translate();
        language.speak();
        if(language instanceof English){
            English english = (English) language;
            english.speech();
        }
    }
}
