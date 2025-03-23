package com.xworkz.javareferenceandvariable;

public class Skill {
    String skillName ;       // Default skill name
    int proficiencyLevel ;                // Default proficiency level
    String category ;             // Default skill category
    int yearsOfExperience ;               // Default years of experience

    // Constructor to initialize custom values
    Skill(String skillName, int proficiencyLevel, String category, int yearsOfExperience) {
        this.skillName = skillName;
        this.proficiencyLevel = proficiencyLevel;
        this.category = category;
        this.yearsOfExperience = yearsOfExperience;
        System.out.println(this.skillName=skillName+" "+this.proficiencyLevel+" "+this.category+" "+this.yearsOfExperience);
    }
    void  display(){
        System.out.println("Running display in skill");
    }

}
