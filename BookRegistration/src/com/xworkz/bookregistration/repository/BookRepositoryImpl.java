package com.xworkz.bookregistration.repository;

import com.xworkz.bookregistration.constant.DBConstant;
import com.xworkz.bookregistration.dto.BookDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {


    @Override
    public String save(BookDTO bookDTO) {

        System.out.println("Connecting to DB.............");
        if (bookDTO != null) {
            try {
                Class.forName(DBConstant.Driver.getProp());
                Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());
                String sql = "insert into book_details value(?,?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, 0);
                preparedStatement.setString(2, bookDTO.getName());
                preparedStatement.setString(3, bookDTO.getAuthor());
                preparedStatement.setInt(4, bookDTO.getPrize());
                preparedStatement.setInt(5, bookDTO.getVolume());
                preparedStatement.executeUpdate();
                System.out.println(connection);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }


        } else {
            System.out.println("null pointer exception");
        }

        return "";

    }


    @Override
    public List<BookDTO> getDetails() {
        System.out.println("Connecting to DB.............");
         List<BookDTO> list = new ArrayList<>();

            try {
                Class.forName(DBConstant.Driver.getProp());
                Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());
                String sql = "Select * from book_details";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("bookname");
                    String author = resultSet.getString("author");
                    int prize = resultSet.getInt("prize");
                    int volume = resultSet.getInt("volume");

                    BookDTO bookDTO1 = new BookDTO();
                    bookDTO1.setVolume(volume);
                    bookDTO1.setName(name);
                    bookDTO1.setPrize(prize);
                    bookDTO1.setAuthor(author);
                    bookDTO1.setId(id);

                    list.add(bookDTO1);

                    System.out.println(bookDTO1);
                }
                System.out.println(connection);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }

        System.out.println(list);
        return list;
    }

    @Override
    public BookDTO getById(int id) {
        try {
            Class.forName(DBConstant.Driver.getProp());
            Connection connection = DriverManager.getConnection(DBConstant.URL.getProp(), DBConstant.USERNAME.getProp(), DBConstant.PASSWORD.getProp());
            String sql = "Select * from book_details where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("bookname");
                String author = resultSet.getString("author");
                int prize = resultSet.getInt("prize");
                int volume = resultSet.getInt("volume");

                BookDTO bookDTO1 = new BookDTO();
                bookDTO1.setVolume(volume);
                bookDTO1.setName(name);
                bookDTO1.setPrize(prize);
                bookDTO1.setAuthor(author);
                bookDTO1.setId(id);



                System.out.println(bookDTO1);
                return bookDTO1;
            }
            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }


}
