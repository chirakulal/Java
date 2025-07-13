package com.xworkz.general.servlet;

import com.xworkz.general.dto.JobDTO;
import com.xworkz.general.service.JobService;
import com.xworkz.general.service.JobServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/jobAplication", loadOnStartup = 1)
public class JobServlet extends HttpServlet {

    public JobServlet(){
        System.out.println("Servlet Created");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String education = req.getParameter("education");
        String skills = req.getParameter("skills");
        String  expectedSalary = req.getParameter("expectedSalary");
        String experience = req.getParameter("experience");

        double expectedSalaryyy = Double.parseDouble(expectedSalary);
        Integer experiences = Integer.parseInt(experience);

        JobDTO jobDTO = new JobDTO(name,email,education,skills,experiences,expectedSalaryyy);
        System.out.println("Job Application : "+jobDTO);

        JobService jobService = new JobServiceImpl();
        String job = jobService.validateAndSave( jobDTO);
        System.out.println("JobService : "+job);


    }
}
