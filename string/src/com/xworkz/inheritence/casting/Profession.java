package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Teacher;
import com.xworkz.inheritence.internal.Person;

public class Profession {

    public void work(Person person){

        person.doJob();
        person.learn();
        person.eat();
        person.earnMoney();
        person.sleep();
        if(person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            teacher.teach();

        }

    }
}
