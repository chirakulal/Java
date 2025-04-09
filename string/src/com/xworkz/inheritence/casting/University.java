package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.School;
import com.xworkz.inheritence.internal.Education;

public class University {

    public void learn(Education education){
        education.certificates();
        education.activity();
        education.events();
        education.exams();
        education.teach();
        if(education instanceof School){
            School school = (School) education;
            school.play();
        }
    }
}
