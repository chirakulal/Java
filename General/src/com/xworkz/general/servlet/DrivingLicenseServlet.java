package com.xworkz.general.servlet;

import com.xworkz.general.dto.DrivingLicenseDTO;
import com.xworkz.general.service.DrivingLicenseService;
import com.xworkz.general.service.DrivingLicenseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/drivinglicense",loadOnStartup = 1)
public class DrivingLicenseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String mobile = req.getParameter("mobile");
        String appliedDate = req.getParameter("appliedDate");
        String vehicleType = req.getParameter("vehicleType");

        long mobile1 = Long.parseLong(mobile);
        LocalDate date = LocalDate.parse(appliedDate);

        DrivingLicenseDTO drivingLicenseDTO = new DrivingLicenseDTO(name,address,mobile1,date,vehicleType);
        System.out.println(drivingLicenseDTO);

        DrivingLicenseService drivingLicenseService = new DrivingLicenseServiceImpl();
       String drive =  drivingLicenseService.validateAndSave(drivingLicenseDTO);
        System.out.println("DrivingLicense : "+drive);



    }
}
