package com.xworkz.bookregistration.service;

import com.xworkz.bookregistration.dto.BookDTO;

import java.util.List;

public interface BookService {

    String validate(BookDTO bookDTO);

    List<BookDTO> getDetails();

}
