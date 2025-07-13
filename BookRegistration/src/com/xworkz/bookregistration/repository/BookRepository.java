package com.xworkz.bookregistration.repository;

import com.xworkz.bookregistration.dto.BookDTO;

import java.util.List;

public interface BookRepository {

    String save(BookDTO bookDTO);

    List<BookDTO> getDetails();

    BookDTO getById(int id);
}
