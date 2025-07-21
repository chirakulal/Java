package com.xworkz.map.dto;

public class StudentDTO implements Comparable<StudentDTO> {
    private String name;
    private int marks;

    public StudentDTO(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentDTO other) {
      if(other.getMarks()<100){
          return 1;
      }else if (other.getMarks()==100){
          return 0;
      }else {
          return -1;
      }
    }

    @Override
    public String toString() {
        return "StudentDTO{name='" + name + "', marks=" + marks + "}";
    }

    public int getMarks() {
        return marks;
    }
}
