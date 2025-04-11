package com.xworkz.inheritence.external;

public class Manager {
    private String name;
    private String department;
    private int experienceYears;

    public Manager(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", department='" + department + '\'' +
                        ", experienceYears=" + experienceYears;
    }

    @Override
    public int hashCode() {
        System.out.println("Parent :" + super.hashCode());
        return 20;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Manager) {
                Manager manager = this;
                Manager manager1 = (Manager) obj;
                if (manager.name.equals(manager1.name) &&
                        manager.department.equals(manager1.department) &&
                        manager.experienceYears == manager1.experienceYears) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
