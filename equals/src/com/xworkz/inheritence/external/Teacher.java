package com.xworkz.inheritence.external;

public class Teacher {

    private String name;
    private String subject;
    private int yearsOfExperience;

    public Teacher(String name, String subject, int yearsOfExperience) {
        this.name = name;
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", subject='" + subject + '\'' +
                        ", yearsOfExperience=" + yearsOfExperience;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 8;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Teacher) {
                Teacher teacher1 = this;
                Teacher teacher2 = (Teacher) obj;
                if (teacher1.name.equals(teacher2.name) &&
                        teacher1.subject.equals(teacher2.subject) &&
                        teacher1.yearsOfExperience == teacher2.yearsOfExperience) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
