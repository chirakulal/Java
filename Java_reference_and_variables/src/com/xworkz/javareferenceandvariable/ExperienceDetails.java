package com.xworkz.javareferenceandvariable;

public class ExperienceDetails {

    String title;
    String duration;
    String responsibilities ;
    String achievements;
    Company company = new Company("cmv","bangaluru",50,"IT");
    Education[] education = new Education[]{new Education("BA","CEC",2025,8),
    new Education("BE","BMIT",2024,9)} ;

    ExperienceDetails(String title, String duration,String responsibilities,String achievements) {
        this.title = title;
        this.duration = duration;
        this.achievements=achievements;
        this.responsibilities=responsibilities;
        System.out.println(this.title+" "+this.duration+" "+this.achievements+" "+this.responsibilities);
    }
    void display(){
        System.out.println("running display in ExperienceDetails");
        if(company!=null&&education!=null){
            company.display();
            for(Education ref:education){
                ref.display();
            }
        }
    }

}
