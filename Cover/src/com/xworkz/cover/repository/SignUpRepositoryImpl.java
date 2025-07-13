package com.xworkz.cover.repository;

import com.xworkz.cover.constant.DBConnect;
import com.xworkz.cover.dto.SignUpDto;

import java.sql.*;
import java.time.LocalDateTime;

public class SignUpRepositoryImpl implements SignUpImpl {


    @Override
    public String save(SignUpDto signUpDto) {
        System.out.println("Connectcting to DB...........");
         if(signUpDto!=null) {
             try {
                 Class.forName(DBConnect.DRIVER.getProp());
                 Connection connection = DriverManager.getConnection(DBConnect.URL.getProp(), DBConnect.USERNAME.getProp(), DBConnect.PASSWORD.getProp());
                 String sql = "insert into cover_details values(?,?,?,?,?)";
                 PreparedStatement preparedStatement = connection.prepareStatement(sql);
                 preparedStatement.setInt(1,0);
                 preparedStatement.setString(2, signUpDto.getEmail());
                 preparedStatement.setString(3, signUpDto.getUserId());
                 preparedStatement.setString(4, signUpDto.getPassword());
                 preparedStatement.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
                 preparedStatement.executeUpdate();
                 System.out.println("connection");
             } catch (ClassNotFoundException | SQLException e) {
                 throw new RuntimeException(e);
             }
         }else{
             System.out.println("null pointer exception");
         }
        return " ";
    }

    @Override
    public SignUpDto check(String userId, String password) {
        System.out.println("Connectcting to DB...........");

            try {
                Class.forName(DBConnect.DRIVER.getProp());
                Connection connection = DriverManager.getConnection(DBConnect.URL.getProp(), DBConnect.USERNAME.getProp(), DBConnect.PASSWORD.getProp());
                String sql = "select userId,password from cover_details where userId=? and password=?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, userId);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){

                    String fetchUserID = resultSet.getString("userId");
                    String fetchPassword = resultSet.getString("password");

                    System.out.println(fetchUserID);
                    System.out.println(fetchPassword);
                    SignUpDto signUpDto = new SignUpDto();
                    signUpDto.setEmail(fetchUserID);
                    signUpDto.setPassword(fetchPassword);
                    return signUpDto;

                }
                System.out.println("connection");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }




        return null;
    }


}
