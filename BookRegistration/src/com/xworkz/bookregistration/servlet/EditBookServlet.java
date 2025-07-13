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

@WebServlet(urlPatterns = "/editBook")
public class EditBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        int idd = Integer.parseInt(id);
        BookService bookService = new BookServiceImpl();
      BookDTO bookDTO = bookService.getById(idd);
      if(bookDTO!=null){
          req.setAttribute("book",bookDTO);
          RequestDispatcher requestDispatcher = req.getRequestDispatcher("Bookedit.jsp");
          requestDispatcher.forward(req,resp);
      }



    }
}
