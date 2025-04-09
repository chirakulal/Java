package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Books;

import com.xworkz.inheritence.internal.Document;

public class Report {

    public void check(Document document){
        document.write();
        document.save();
        document.read();
        document.open();
        document.print();
        if(document instanceof Books){
            Books books = (Books) document;
            books.edit();
        }
    }
}
