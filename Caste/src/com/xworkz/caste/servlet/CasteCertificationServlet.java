package com.xworkz.caste.servlet;

import com.xworkz.caste.dto.CasteDTO;
import com.xworkz.caste.service.CasteService;
import com.xworkz.caste.service.CasteServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/submitCaste",loadOnStartup = 1)
public class CasteCertificationServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String address = req.getParameter("address");
        String caste = req.getParameter("caste");
        String gender = req.getParameter("gender");
        String occupation = req.getParameter("occupation");
        String age = req.getParameter("age");
        String income = req.getParameter("income");
        String bpl = req.getParameter("bpl");

        int age1 = Integer.parseInt(age);
        double income1 = Double.parseDouble(income);
        boolean isBpl = Boolean.parseBoolean(bpl);


        CasteDTO casteDTO = new CasteDTO(fullName,address,caste,gender,occupation,age1,income1,isBpl);
        System.out.println("CasteDto :"+casteDTO);

        CasteService casteService = new CasteServiceImpl();
        String result = casteService.validate(casteDTO);
        System.out.println("casteservice " +result);





    }
}
