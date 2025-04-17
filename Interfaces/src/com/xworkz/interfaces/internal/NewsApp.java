package com.xworkz.interfaces.internal;

public interface NewsApp {

    void showHeadlines();
    void readArticle();
    void bookmarkNews();

    default void showArticle(){
        System.out.println("Running show Article in showArticle");
    }
}
