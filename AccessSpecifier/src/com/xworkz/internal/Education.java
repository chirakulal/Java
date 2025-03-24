package com.xworkz.internal;

public class Education {

    School school;

    public Education(School school){
        this.school=school;
    }

   public void learn(){
        System.out.println("Running learn in education");
        if(this.school!=null){
            this.school.requirement();
            this.school.study();
            System.out.println(this.school.garde);
            System.out.println(this.school.name);
        }

    }

}
