package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Manager;
import com.xworkz.inheritence.internal.Employee;

public class TeamLeader {

    public void check(Employee employee){
        employee.timepass();
        employee.work();
        employee.salary();
        employee.eat();
        employee.department();
        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            manager.schedule();
        }
    }
}
