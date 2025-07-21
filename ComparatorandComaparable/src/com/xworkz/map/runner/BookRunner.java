package com.xworkz.map.runner;

import com.xworkz.map.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRunner {

    public static void main(String[] args) {
        List<BookDTO> list = new ArrayList<>();
        list.add(new BookDTO("Java Basics", 250));
        list.add(new BookDTO("Python Crash Course", 180));
        list.add(new BookDTO("C++ Primer", 350));
        list.add(new BookDTO("JavaScript Guide", 120));

        list.forEach(e-> System.out.println(e));

        System.out.println("------------------------------------------------------------");

        Collections.sort(list);

        list.forEach(e-> System.out.println(e));
    }
}
