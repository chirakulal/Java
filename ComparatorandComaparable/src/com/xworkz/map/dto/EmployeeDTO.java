package com.xworkz.map.dto;

public class EmployeeDTO implements Comparable<EmployeeDTO> {
    private String name;
    private double salary;

    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeDTO other) {
       if(other.getSalary()>this.salary){
           return 1;
       } else if (other.getSalary()==this.salary) {
           return 0;

       } else {
           return -1;
       }
    }

    @Override
    public String toString() {
        return "EmployeeDTO{name='" + name + "', salary=" + salary + "}";
    }

    public double getSalary() {
        return salary;
    }
}
