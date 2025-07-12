package com.xworkz.bookregistration.servlet;

import com.xworkz.bookregistration.dto.BookDTO;
import com.xworkz.bookregistration.service.BookService;
import com.xworkz.bookregistration.service.BookServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/book",loadOnStartup = 1)
public class BookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String author = req.getParameter("author");
        String prize = req.getParameter("prize");
        String volume = req.getParameter("volume");

        int prizee = Integer.parseInt(prize);
        int volumes = Integer.parseInt(volume);

        BookDTO bookDTO = new BookDTO();
        bookDTO.setName(name);
        bookDTO.setAuthor(author);
        bookDTO.setPrize(prizee);
        bookDTO.setVolume(volumes);

        BookService bookService = new BookServiceImpl();
        bookService.validate(bookDTO);
        System.out.println(bookDTO);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookDTO bookDTO = new BookDTO();
        BookService bookService = new BookServiceImpl();
      List<BookDTO> list = bookService.getDetails();
        req.setAttribute("dto", list);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("booklist.jsp");
        requestDispatcher.forward(req,resp);
    }
}
