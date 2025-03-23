package com.xworkz.javareferenceandvariable;

public class Personnel {
    String personnelType ;
    int personnelID;
    String shiftTiming ;
    boolean isTrained ;
    Skill skill = new Skill("unknown",8,"fighting",5);

    Personnel(String personnelType, int personnelID, String shiftTiming, boolean isTrained) {
        this.personnelType = personnelType;
        this.personnelID = personnelID;
        this.shiftTiming = shiftTiming;
        this.isTrained = isTrained;
        System.out.println(this.personnelType+" "+this.personnelID+" "+this.shiftTiming+" "+this.isTrained);
    }
    void display(){
        System.out.println("Running display in Personel");
        if(skill!=null){
            skill.display();
        }
    }
}
