package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.NewsApp;
import com.xworkz.interfaces.internal.NoteTaking;

public class StudyTime implements NoteTaking, NewsApp {

    @Override
    public void writeNote() {
        System.out.println("Running method in StudyTime");
    }

    @Override
    public void highlightText() {
        System.out.println("Running method in StudyTime");

    }

    @Override
    public void bookmarkNews() {
        System.out.println("Running method in StudyTime");

    }

    @Override
    public void readArticle() {
        System.out.println("Running method in StudyTime");

    }

    @Override
    public void deleteNote() {
        System.out.println("Running method in StudyTime");

    }

    @Override
    public void showHeadlines() {

        System.out.println("Running method in StudyTime");

    }
}
