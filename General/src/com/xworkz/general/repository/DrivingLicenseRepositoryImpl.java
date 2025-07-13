package com.xworkz.general.repository;

import com.xworkz.general.dto.DrivingLicenseDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DrivingLicenseRepositoryImpl implements DrivingLicenseRepository{
    @Override
    public String save(DrivingLicenseDTO drivingLicenseDTO) {

        System.out.println("Saving the Driving in db...");
        System.out.println("WARN:connected to db");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ko19rom";
            String username="root";
            String password="Chir@#$123";

            Connection connection= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
