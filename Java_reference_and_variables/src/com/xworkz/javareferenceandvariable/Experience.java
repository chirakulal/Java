package com.xworkz.javareferenceandvariable;

public class Experience {

    int totalYears;
    String field;
    ExperienceDetails[] experienceDetails = new ExperienceDetails[]{new ExperienceDetails("SoftwareEngineer","12","teamleader","10%efficency"),
        new ExperienceDetails("Productmanager","12","manager","10%efficency")};

    Experience(int totalYears, String field) {
        this.totalYears = totalYears;
        this.field = field;
        System.out.println(this.field+" "+this.totalYears);
    }
    void display(){
        System.out.println("Running display in Experience");
        if(experienceDetails!=null){
            for(ExperienceDetails value : experienceDetails){
                value.display();
            }
        }
    }

}
