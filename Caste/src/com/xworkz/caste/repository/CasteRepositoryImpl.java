package com.xworkz.caste.repository;

import com.xworkz.caste.dto.CasteDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CasteRepositoryImpl implements CasteRepository{
    @Override
    public String save(CasteDTO casteDTO) {

        System.out.println("Saving the castedetails in db...");
        System.out.println("WARN:connected to db");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/ko19rom";
            String username = "root";
            String password ="Chir@#$123";

            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection:"+ connection);

            String sql = "insert into caste_details values(0,'"+casteDTO.getFullName()+"','"+casteDTO.getAddress()+"','"+casteDTO.getCaste()+"','"+casteDTO.getGender()+"','"+casteDTO.getOccupation()+"',"+casteDTO.getAge()+","+casteDTO.getIncome()+","+casteDTO.isBpl()+")";
            Statement statement =connection.createStatement();
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return "";
    }
}
