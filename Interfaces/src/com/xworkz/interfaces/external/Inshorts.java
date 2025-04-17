package com.xworkz.interfaces.external;

import com.xworkz.interfaces.internal.NewsApp;

public class Inshorts implements NewsApp {


    @Override
    public void showHeadlines() {
        System.out.println("Running showHeadlines in Inshorts");
    }

    @Override
    public void readArticle() {
        System.out.println("Running readArticle in Inshorts");
    }

    @Override
    public void bookmarkNews() {
        System.out.println("Running bookmarkNews in Inshorts");
    }

}
