package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import dao.Config;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    @Override
    public User findByUsername(String username) {
        User user = null;
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        String searchTermWithWildcards = "%" + username + "%";
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, searchTermWithWildcards);
            ResultSet resultSet = ps.executeQuery();
            if(resultSet.next()){
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("username"),
                        resultSet.getString("email"),
                        resultSet.getString("password"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
        return user;
    }

    @Override
    public Long insert(User user) {
        try {
            String sql = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }

    public static void main(String[] args) {
        Users usersDao = new MySQLUsersDao(new Config());
        System.out.println(usersDao.findByUsername("hot_dog_water_man"));
        System.out.println(usersDao.findByUsername("not_dog_water_man"));

        User newUser = new User(
                "Jeff",
                "jeff@email.com",
                "mynamejeff"
        );
        usersDao.insert(newUser);
    }
}
