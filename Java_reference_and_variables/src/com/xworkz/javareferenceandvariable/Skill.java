package com.xworkz.javareferenceandvariable;

public class Skill {
    String skillName ;
    int proficiencyLevel ;
    String category ;
    int yearsOfExperience ;
    Experience experience = new Experience(20,"finance");

    Skill(String skillName, int proficiencyLevel, String category, int yearsOfExperience) {
        this.skillName = skillName;
        this.proficiencyLevel = proficiencyLevel;
        this.category = category;
        this.yearsOfExperience = yearsOfExperience;
        System.out.println(this.skillName+" "+this.proficiencyLevel+" "+this.category+" "+this.yearsOfExperience);
    }
    void  display(){
        System.out.println("Running display in skill");
        if(experience!=null){
            experience.display();
        }
    }

}
