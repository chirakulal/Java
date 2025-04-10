package com.xworkz.instance;

public class Company {

    public String name ;
    String department ;
    private int employeeId ;

   public Company(String name,String department,int employeeId){
        this.name=name;
        this.department=department;
        this.employeeId=employeeId;
    }
    public void work(){
        System.out.println("Running work in company");
    }
    void join(){
        System.out.println("Running join in company");
    }
    private void fire(){
        System.out.println("Running  fire in Company");
    }
}
