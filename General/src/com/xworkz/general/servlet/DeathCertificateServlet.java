package com.xworkz.general.servlet;

import com.xworkz.general.dto.DeathCertificateDTO;
import com.xworkz.general.service.DeathCertificateService;
import com.xworkz.general.service.DeathCertificateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/deathcertificate",loadOnStartup = 1)
public class DeathCertificateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String cause= req.getParameter("cause");
        String date = req.getParameter("date");
        String time = req.getParameter("time");
        String ageByDeath = req.getParameter("ageByDeath");
        String certify = req.getParameter("certify");
        String hospitalName = req.getParameter("hospitalName");
        String mannerofdeath = req.getParameter("mannerofdeath");

        LocalDate date1 = LocalDate.parse(date);
        LocalTime time1 = LocalTime.parse(time);
        int ageDeath = Integer.parseInt(ageByDeath);

        DeathCertificateDTO deathCertificateDTO = new DeathCertificateDTO(name,cause,date1,time1,ageDeath,certify,hospitalName,mannerofdeath);
        System.out.println("DeathCertificate :"+deathCertificateDTO);

        DeathCertificateService deathCertificateService = new DeathCertificateServiceImpl();
        String death = deathCertificateService.validateAndSave(deathCertificateDTO);
        System.out.println("DeathCertificate :"+death);




    }
}
