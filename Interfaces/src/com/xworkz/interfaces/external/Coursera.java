package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.EducationPlatform;

public class Coursera implements EducationPlatform {

    @Override
    public void enrollCourse() {
        System.out.println("Running enrollCourse in Coursera");
    }

    @Override
    public void watchLecture() {
        System.out.println("Running watchLecture in Coursera");
    }

    @Override
    public void completeAssignment() {
        System.out.println("Running completeAssignment in Coursera");
    }

    @Override
    public void receiveCertificate() {
        System.out.println("Running reciveCertificate in Coursera");

    }
}
