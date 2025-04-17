package com.xworkz.interfaces.internal;

public interface EducationPlatform {

    void enrollCourse();
    void watchLecture();
    void completeAssignment();
    default  void receiveCertificate(){
        System.out.println("Running receiveCertificate in EducationPlatform");

    }
}
