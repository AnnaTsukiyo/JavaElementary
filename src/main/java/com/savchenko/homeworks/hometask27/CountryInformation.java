package com.savchenko.homeworks.hometask27;

import com.savchenko.homeworks.hometask25.PojoCountry;
import com.savchenko.homeworks.hometask26.DatabaseConnection;

import javax.persistence.Table;
import java.sql.*;

@Table(name = "world.country")
public class CountryInformation {

    PojoCountry country = new PojoCountry();
    Connection conn = null;
    Statement stmt = null;
    String query = null;

    public PojoCountry getInfo(String code2) {

        try {
            conn = DatabaseConnection.initializeDatabase();
            query = "SELECT * FROM world.country WHERE Code2 = ?";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                country = new PojoCountry(
                        rs.getString("code"),
                        rs.getString("name"),
                        rs.getString("continent"),
                        rs.getString("region"),
                        rs.getDouble("SurfaceArea"),
                        rs.getInt("indepYear"),
                        rs.getLong(" population"),
                        rs.getDouble(" lifeExpectancy"),
                        rs.getDouble("GNP"),
                        rs.getDouble("GNPOld"),
                        rs.getString("LocalName"),
                        rs.getString("GovernmentForm"),
                        rs.getString("HeadOfState"),
                        rs.getLong("capital"),
                        rs.getString("Code2"));
                System.out.println("Country Found :" + country);
            }

            rs.close();
            stmt.close();
            stmt = null;
            conn.close();
            conn = null;

        } catch (Exception e) {
            System.out.println(e);
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlex) {
                }
                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlex) {
                }
                conn = null;
            }
        }
        return country;
    }
}
