package com.savchenko.homeworks.hometask26;

import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/city")
public class DeleteCitiesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @SneakyThrows
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        Connection con;

        try {
            response.setContentType("text/html");
            Class.forName("com.mysql.jdbc.Driver");
            con = DatabaseConnection.initializeDatabase();
            PreparedStatement ps = con.prepareStatement("DELETE FROM world.city WHERE id=?");
            long id = ps.executeUpdate();
            ps.setLong(1, id);
            if (id != 0) {
                out.println("Deleting rows");
            } else {
                out.print("Deleted");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}