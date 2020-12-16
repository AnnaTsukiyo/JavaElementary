package com.savchenko.homeworks.hometask26;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/country")
public class CountryServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException {
        try {
            Connection conn = DatabaseConnection.initializeDatabase();
            String query = "SELECT * FROM world.country WHERE code = ?";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            PrintWriter out = response.getWriter();
            FileWriter fw = new FileWriter(new File("countries.csv"));
            fw.append("code");
            fw.append(',');
            fw.append("name");
            fw.append(',');
            fw.append("continent");
            fw.append(',');
            fw.append("region");
            fw.append(',');
            fw.append("surfaceArea");
            fw.append(',');
            fw.append("indepYear");
            fw.append(',');
            fw.append("population");
            fw.append(',');
            fw.append("lifeExpectancy");
            fw.append(',');
            fw.append("GNP");
            fw.append(',');
            fw.append("GNPOld");
            fw.append(',');
            fw.append("LocalName");
            fw.append(',');
            fw.append("GovernmentForm");
            fw.append(',');
            fw.append("HeadOfState");
            fw.append(',');
            fw.append("capital");
            fw.append(',');
            fw.append("code2");
            fw.append('\n');

            while (rs.next()) {
                fw.append(rs.getString(1));
                fw.append(',');
                fw.append(rs.getString(2));
                fw.append(',');
                fw.append(rs.getString(3));
                fw.append(',');
                fw.append(rs.getString(4));
                fw.append(',');
                fw.append(rs.getString(5));
                fw.append(',');
                fw.append(rs.getString(6));
                fw.append(',');
                fw.append(rs.getString(7));
                fw.append(',');
                fw.append(rs.getString(8));
                fw.append(',');
                fw.append(rs.getString(9));
                fw.append(',');
                fw.append(rs.getString(10));
                fw.append(',');
                fw.append(rs.getString(11));
                fw.append(',');
                fw.append(rs.getString(12));
                fw.append(',');
                fw.append(rs.getString(13));
                fw.append(',');
                fw.append(rs.getString(14));
                fw.append(',');
                fw.append(rs.getString(15));
                fw.append('\n');
            }
            fw.flush();
            fw.close();
            conn.close();
            out.println
                    ("<b>You Successfully Created Csv file.</b>");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception " + e);
        }
    }
}
