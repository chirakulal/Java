package com.xworkz.inheritence.external;

import com.xworkz.inheritence.internal.Book;

public class Novel extends Book {

    public Novel(){
        super();
        System.out.println("no-arg const running in Novel");
    }
    @Override
    public void read(){
        System.out.println("Running read in Novel");
    }
    @Override
    public void write(){
        System.out.println("Running write in Novel");
    }
    @Override
    public void publish(){
        System.out.println("Running publish in Novel");
    }
    @Override
    public void edit(){
        System.out.println("Running edit in Novel");
    }
    @Override
    public void rewrite(){
        System.out.println("Running rewrite in Novel");
    }
    public void sell(){
        System.out.println("Running sell in Novel");
    }
}
