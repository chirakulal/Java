package com.xworkz.javareferenceandvariable;

public class Minister {

    String name;
    String department;
    int age;
    int experience;
    PersonalAssistant personalAssistant = new PersonalAssistant("Tina","schedule",30,5);
    Security security = new Security("national",30,"high",true);
    Portfolio[] portfolio = new Portfolio[]{
            new Portfolio("foriegn",101,"country affairs",30),
            new Portfolio("finance",103,"finance of sountry",100)
    };




    Minister(String name,String department,int age,int experience){
        this.name=name;
        this.department=department;
        this.age=age;
        this.experience=experience;
    }

    void display(){
        System.out.println("running display in Minister");
        System.out.println("name is: "+this.name+" |department is: "+this.department+" age is: "+this.age+" experience is "+this.experience);
        if(personalAssistant!=null&&security!=null&&portfolio!=null){
            personalAssistant.display();
            security.display();
            for(Portfolio ref:portfolio){
                ref.display();
            }

        }
    }
}
