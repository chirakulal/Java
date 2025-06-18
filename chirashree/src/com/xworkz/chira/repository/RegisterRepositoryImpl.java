package com.xworkz.chira.repository;

import com.xworkz.chira.dto.RegisterDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepositoryImpl implements RegisterRepository{
    @Override
    public String save(RegisterDto registerDto) {
        System.out.println("Connected to database");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/ko19rom";
            String username = "root";
            String password = "Chir@#$123";
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql = "insert into register values(0,'"+registerDto.getFullName()+"','"+registerDto.getEmail()+"','"+registerDto.getPassword()+"','"+registerDto.getConfirmPassword()+"',"+registerDto.getMobileNo()+")";
         Statement statement = connection.createStatement();
         statement.executeUpdate(sql);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return "";
    }
}
