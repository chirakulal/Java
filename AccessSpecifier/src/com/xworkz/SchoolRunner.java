package com.xworkz;

import com.xworkz.external.Student;
import com.xworkz.internal.Education;
import com.xworkz.internal.School;

public class SchoolRunner {

    public static void main(String[] args) {
        School school = new School();

        Education education = new Education(school);
           education.learn();

        Student student =new Student(school);
        student.educate();

    }
}
