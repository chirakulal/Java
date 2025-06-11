package com.xworkz.general.servlet;

import com.xworkz.general.dto.MarriageCertificateDTO;
import com.xworkz.general.service.MarriageCertificateService;
import com.xworkz.general.service.MarriageCertificateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/marriageCertificate",loadOnStartup = 1)
public class MarriageCertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String location = req.getParameter("location");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        String date = req.getParameter("date");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");
        String officer = req.getParameter("officer");

        LocalDate date1 = LocalDate.parse(date);

        MarriageCertificateDTO marriageCertificateDTO = new MarriageCertificateDTO(groomName,brideName,location,address,religion,date1,witness1,witness2,officer);
        System.out.println(marriageCertificateDTO);

        MarriageCertificateService marriageCertificateService = new MarriageCertificateServiceImpl();
        String marriage =marriageCertificateService.validateAndSave(marriageCertificateDTO);
        System.out.println("MarriageCertificate  :"+marriage);



    }
}
