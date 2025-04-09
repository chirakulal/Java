package com.xworkz.inheritence.casting;

import com.xworkz.inheritence.external.Novel;
import com.xworkz.inheritence.internal.Book;

public class OnlineNovel {

    public void buy(Book book){
        book.rewrite();
        book.read();
        book.edit();
        book.publish();
        book.write();
        if(book instanceof Novel){
            Novel novel = (Novel) book;
            novel.sell();
        }
    }
}
