package com.xworkz.map.runner;

import com.xworkz.map.dto.StudentDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

    public static void main(String[] args) {
        List<StudentDTO> studentDTOS = new ArrayList<>();
        studentDTOS.add(new StudentDTO("Shravya",199));
        studentDTOS.add(new StudentDTO("Sura",50));
        studentDTOS.add(new StudentDTO("Sathwika",189));
        studentDTOS.add(new StudentDTO("Manvitha",99));
        studentDTOS.add(new StudentDTO("Rithika",100));

        studentDTOS.forEach(e-> System.out.println(e));

        System.out.println("---------------------------------------------------");

        Collections.sort(studentDTOS);
        studentDTOS.forEach(e-> System.out.println(e));
    }
}
