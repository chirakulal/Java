package com.xworkz.bookregistration.service;

import com.xworkz.bookregistration.dto.BookDTO;
import com.xworkz.bookregistration.repository.BookRepository;
import com.xworkz.bookregistration.repository.BookRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public String validate(BookDTO bookDTO) {
        String name = bookDTO.getName();
        if(name.isEmpty() ||name.length()>30){
            System.out.println("name is too long or short");
            return "Please enter the BOOK name";
        }
        String author = bookDTO.getAuthor();
        if(author.isEmpty()){
            System.out.println("enter author name");
            return "Please enter author name";
        }

        if (bookDTO != null) {
            BookRepository bookRepository = new BookRepositoryImpl();
            bookRepository.save(bookDTO);
            System.out.println(bookDTO);
        }
        return "submitted successfully";
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

    @Override
    public BookDTO getById(int id) {
        if (id > 0) {
            BookRepository bookRepository = new BookRepositoryImpl();
            BookDTO bookDTO = bookRepository.getById(id);
            System.out.println(bookDTO);
            return bookDTO;
        }

        return null;
    }

}
