package com.savchenko.homeworks.hometask26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 1.Create a Servlet CountryServlet which sends when entering the page / country returns a .csv file with countries from the database
 * 2.Create a servlet CityServlet that, when you visit the / city page, returns an html page with a list of cities from the database
 * 3.When a DELETE request is made to the endpoint / city? Id = 5, the city that is passed to the id parameter should be deleted from the database (5 is for example)
 **/

public class DatabaseConnection {
    protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/";
        String DB_Driver = "com.mysql.jdbc.Driver";
        String DB_User_Name = "root";
        String DB_Password = "password";
        String DB_Name = "world";
        Class.forName(DB_Driver);
        return DriverManager.getConnection(url + DB_Name, DB_User_Name, DB_Password);
    }
}
