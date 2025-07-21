package com.xworkz.map.runner;

import com.xworkz.map.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRunner {

    public static void main(String[] args) {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        employeeDTOS.add(new EmployeeDTO("Rama",200000000));
        employeeDTOS.add(new EmployeeDTO("Thushara",5000000));
        employeeDTOS.add(new EmployeeDTO("Diya",9000000));
        employeeDTOS.add(new EmployeeDTO("Chira",20000000));

        employeeDTOS.forEach(e-> System.out.println(e));

        System.out.println("-------------------------------------------------------------------------------");

        Collections.sort(employeeDTOS);
        employeeDTOS.forEach(e-> System.out.println(e));

    }
}
