package com.xworkz.javareferenceandvariable;

public class PersonalAssistant {


     String name;
     String specialisation;
     int age;
     int exp;

     PersonalAssistant(String name,String specialisation,int age,int exp){
          this.name=name;
          this.specialisation=specialisation;
          this.age=age;
          this.exp=exp;
     }

     void display(){
          System.out.println("Running display in personalassistant");
          System.out.println("the name is : "+this.name+" |the specialisation: "+this.specialisation+" |the age is: "+this.age+" |the experiance is: "+this.exp);

     }
}
