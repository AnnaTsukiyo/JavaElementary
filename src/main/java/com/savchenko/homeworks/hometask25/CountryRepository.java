package com.savchenko.homeworks.hometask25;

import com.savchenko.homeworks.hometask24.ConnectionFactory;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CountryRepository<Country> implements Repository<Country> {

    private final List<Country> countries = new ArrayList<>();

    @Override
    public Country getById(long id) {
        String code = null;
        String query = "SELECT * FROM country WHERE code = ?";
        Country country = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = ConnectionFactory.getMySQLConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, Long.parseLong(code));
            rs = ps.executeQuery();
            if (rs.next()) {
                country = (Country) new PojoCountry(
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
            } else {
                System.out.println("No Country found with code=" + code);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return country;
    }

    @Override
    public List<Country> getAll() {
        List<Country> countries = new ArrayList<>();
        String query = "SELECT code,name,continent,region,surfaceArea FROM country WHERE code =?";

        try (Connection connection = ConnectionFactory.getMySQLConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                PojoCountry country = new PojoCountry();
                country.setCode(rs.getString("code"));
                country.setName(rs.getString("name"));
                country.setContinent(rs.getString("continent"));
                country.setRegion(rs.getString("region"));
                country.setSurfaceArea(rs.getDouble("SurfaceArea"));
                countries.add((Country) country);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return countries;
    }

    @Override
    public void delete(long id) {
        String code = null;
        Connection connection = null;
        Statement stmt = null;
        try {
            connection = ConnectionFactory.getMySQLConnection();
            stmt = connection.createStatement();
            stmt.execute("DELETE FROM countries WHERE code = ?");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(stmt).close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SneakyThrows
    @Override
    public boolean exists(long id) {
        String code = null;
        String sql = "Select 1 from city where code = ?";
        Connection connection = ConnectionFactory.getMySQLConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.valueOf(Long.parseLong(code)));
        ResultSet rs = ps.executeQuery();
        connection.close();
        return rs.next();
    }

    @SneakyThrows
    @Override
    public Long count() {
        Connection connection = ConnectionFactory.getMySQLConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS COUNT FROM countries");
        while (rs.next()) {
            System.out.println("The count is " + rs.getLong("COUNT"));
        }
        long count = rs.getLong("COUNT(*)");
        connection.close();
        return count;
    }

    @Override
    public Country insert(Country object) {
        String query = "INSERT INTO country (code, name, continent, region, SurfaceArea,indepYear) VALUES (?,?,?,?,?,?)";
        try (Connection connection = ConnectionFactory.getMySQLConnection()) {
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            Iterator<Country> it = countries.iterator();
            while (it.hasNext()) {
                Country c = it.next();
                preparedStmt.setString(1, "SSU");
                preparedStmt.setString(2, "South Sudan");
                preparedStmt.setString(3, "Africa");
                preparedStmt.setString(4, "East-Central Africa");
                preparedStmt.setDouble(5, 619745.00);
                preparedStmt.setInt(6, 2011);
                preparedStmt.execute();
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (Country) countries;
    }
}