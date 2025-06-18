package com.xworkz.chira.servlet;

import com.xworkz.chira.dto.RegisterDto;
import com.xworkz.chira.service.RegisterService;
import com.xworkz.chira.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String number = req.getParameter("mobile");

        long mobileNo = Long.parseLong(number);

        RegisterDto registerDto = new RegisterDto();
        registerDto.setFullName(fullName);
        registerDto.setEmail(email);
        registerDto.setPassword(password);
        registerDto.setConfirmPassword(confirmPassword);
        registerDto.setMobileNo(mobileNo);

        System.out.println(registerDto);

        RegisterService registerService = new RegisterServiceImpl();
       String result = registerService.validate(registerDto);

        System.out.println(result);





    }
}
