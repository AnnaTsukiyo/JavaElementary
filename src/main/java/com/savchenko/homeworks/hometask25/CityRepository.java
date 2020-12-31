package com.savchenko.homeworks.hometask25;

import com.savchenko.homeworks.hometask24.ConnectionFactory;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CityRepository<City> implements Repository<City> {

    private final List<City> cities = new ArrayList<>();

    @Override
    public City getById(long id) {
        String query = "SELECT * FROM city WHERE id = ?";
        City city = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = ConnectionFactory.getMySQLConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                city = (City) new PojoCity(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("countryCode"),
                        rs.getString("district"),
                        rs.getLong("population"));
                System.out.println("City Found :" + city);
            } else {
                System.out.println("No City found with id=" + id);
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
        return city;
    }

    @Override
    public List<City> getAll() {
        List<City> cityList = new ArrayList<>();
        String query = "SELECT id,name,countryCode,district,population FROM city WHERE id =?";

        try (Connection connection = ConnectionFactory.getMySQLConnection();
             Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                PojoCity city = new PojoCity();
                city.setID(rs.getLong("id"));
                city.setName(rs.getString("name"));
                city.setCountryCode(rs.getString("CountryCode"));
                city.setDistrict(rs.getString("District"));
                city.setPopulation(rs.getLong("population"));
                cityList.add((City) city);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cityList;
    }

    @Override
    public void delete(long id) {
        Connection connection = null;
        Statement stmt = null;
        try {
            connection = ConnectionFactory.getMySQLConnection();
            stmt = connection.createStatement();
            stmt.execute("DELETE FROM city WHERE id = ?");
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
        String sql = "SELECT 1 FROM city WHERE id = ?";
        Connection connection = ConnectionFactory.getMySQLConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, String.valueOf(id));
        ResultSet rs = ps.executeQuery();
        connection.close();
        return rs.next();
    }

    @SneakyThrows
    @Override
    public Long count() {
        Connection connection = ConnectionFactory.getMySQLConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS COUNT FROM city");
        while (rs.next()) {
            System.out.println("The count is " + rs.getLong("COUNT"));
        }
        long count = rs.getLong("COUNT(*)");
        connection.close();
        return count;
    }

    @Override
    public City insert(City object) {
        String query = "INSERT INTO city (id, name, countryCode, district, population) VALUES (?,?,?,?,?)";
        try (Connection connection = ConnectionFactory.getMySQLConnection()) {
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            Iterator<City> it = cities.iterator();
            while (it.hasNext()) {
                City c = it.next();
                preparedStmt.setLong(1, 534);
                preparedStmt.setString(2, "Uman");
                preparedStmt.setString(3, "UMN");
                preparedStmt.setString(4, "Cherkassy");
                preparedStmt.setLong(5, 100_000);
                preparedStmt.execute();
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return (City) cities;
    }
}