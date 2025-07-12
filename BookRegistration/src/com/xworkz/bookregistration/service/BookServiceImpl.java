package com.xworkz.bookregistration.service;

import com.xworkz.bookregistration.dto.BookDTO;
import com.xworkz.bookregistration.repository.BookRepository;
import com.xworkz.bookregistration.repository.BookRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public String validate(BookDTO bookDTO) {
        if (bookDTO != null) {
            BookRepository bookRepository = new BookRepositoryImpl();
            bookRepository.save(bookDTO);
            System.out.println(bookDTO);
        }
        return "null pointer";
    }

    @Override
    public List<BookDTO> getDetails() {
        List<BookDTO> list = new ArrayList<>();


            BookRepository bookRepository = new BookRepositoryImpl();
            list = bookRepository.getDetails();
            if (list.isEmpty()) {
                System.out.println("No DB is found");
            } else {
                System.out.println("Books retrived :" + list.size());
            }

        return list;

    }
}
