package com.savchenko.homeworks.hometask26;

import lombok.SneakyThrows;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/city")
public class CityServlet extends HttpServlet {

    @SneakyThrows
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String title = "Database Result";

            String docType =
                    "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

            out.println(docType +
                    "<html>\n" +
                    "<head><title>" + title + "</title></head>\n" +
                    "<body bgcolor = \"#f0f0f0\">\n" +
                    "<h1 align = \"center\">" + title + "</h1>\n");
            try {
                Connection conn = DatabaseConnection.initializeDatabase();
                String query = "SELECT * FROM world.city WHERE id = ?";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {
                    long id = rs.getLong("id");
                    String name = rs.getString("name");
                    String countryCode = rs.getString("countryCode");
                    String district = rs.getString("district");
                    long population = rs.getLong("population");

                    out.println("ID: " + id + "<br>");
                    out.println(", Name: " + name + "<br>");
                    out.println(", CountryCode: " + countryCode + "<br>");
                    out.println(", District: " + district + "<br>");
                    out.println(", Population: " + population + "<br>");
                }
                out.println("</body></html>");
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
