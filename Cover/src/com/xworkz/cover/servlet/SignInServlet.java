package com.xworkz.cover.servlet;


import com.xworkz.cover.dto.SignUpDto;
import com.xworkz.cover.service.SIgnUpService;
import com.xworkz.cover.service.SignUpServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signin")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        SignUpDto signUpDto = new SignUpDto();
        signUpDto.setEmail(userId);
        signUpDto.setPassword(password);

        SIgnUpService sIgnUpService = new SignUpServiceImpl();
        String result = sIgnUpService.check(userId, password);
        if (result != null) {
            if (!result.equals("Login is Successfully")) {
                req.setAttribute("dto", signUpDto);
                req.setAttribute("errormessages", result);
            } else {
                req.setAttribute("sucess", result);
                RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("home.jsp");
                requestDispatcher1.forward(req, resp);

            }
        }
        else
            System.out.println("null");
    }
    }

