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
import java.time.LocalDateTime;

@WebServlet(urlPatterns = "/signup" ,loadOnStartup = 1)
public class SignUpServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String userId = req.getParameter("name");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("password2");

        SignUpDto signUpDto = new SignUpDto();
        signUpDto.setEmail(email);
        signUpDto.setUserId(userId);
        signUpDto.setPassword(password);
        signUpDto.setConfirmPassword(confirmPassword);
        signUpDto.setCreatedAt(LocalDateTime.now());

        System.out.println(signUpDto);

        SIgnUpService sIgnUpService = new SignUpServiceImpl();
        String result = sIgnUpService.validate(signUpDto);


        if (!result.equals("Submitted Successfully")) {
            System.out.println("The form is not submitted");
            req.setAttribute("dto", signUpDto);
            req.setAttribute("Errormessage", result);
        } else {
            req.setAttribute("Sucessmessage", result);
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("signup.jsp");
        requestDispatcher.forward(req, resp);


    }


}
