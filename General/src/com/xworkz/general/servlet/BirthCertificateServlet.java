package com.xworkz.general.servlet;



import com.xworkz.general.dto.BirthCertificateDTO;
import com.xworkz.general.service.BirthCertificateService;
import com.xworkz.general.service.BirthCertificateServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/birthcertificate", loadOnStartup = 1)
public class BirthCertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        String birthId =  servletRequest.getParameter("birth");
        String hospitalName = servletRequest.getParameter("hospitalName");
        String father = servletRequest.getParameter("father");
        String mother = servletRequest.getParameter("mother");
        String date =servletRequest.getParameter("date");
        String doctor =servletRequest.getParameter("doctor");
        String nurse =servletRequest.getParameter("nurse");
        String hospitalType =servletRequest.getParameter("hospitalType");

        int birthid = Integer.parseInt(birthId);
        LocalDate date1 = LocalDate.parse(date);

        BirthCertificateDTO birthCertificateDTO = new BirthCertificateDTO(birthid,hospitalName,father,mother,date1,doctor,nurse,hospitalType);

        System.out.println("BirthCertificate : "+birthCertificateDTO);

        BirthCertificateService birthCertificateService = new BirthCertificateServiceImpl();
       String birth = birthCertificateService.validateAndSave(birthCertificateDTO);
        System.out.println("BirthCertificate :"+birth);




    }
}
