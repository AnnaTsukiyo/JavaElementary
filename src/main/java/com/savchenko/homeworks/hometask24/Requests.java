package com.savchenko.homeworks.hometask24;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;

/**
 * 1.Select all workers with odd Id
 * 2.Get a list of all workers named David.
 * 3.Get a list of all employees from the 54th department with a salary greater than 5000
 * 4.Get a list of all employees with the last letter in the name 'd'
 * 5.Get a list of all employees whose salary between 2000 and 4000 (inclusive)
 * 6.Get a list of who live in Europe (name of the region)
 * 7.Show all managers with more than 6 employees
 * 8.Get a list of employees whose manager receives a salary of more than 10,000
 * +
 */

public class Requests {

    public static void main(String[] args) throws SQLException {

        int employee_ID = getInt("employee_ID");
        String first_name = getString("first_name");
        int department_id = getInt("department_id");
        String last_name = getString("last_name");
        int salary = getInt("salary");
        String region_name = getString("region_name");
        int manager_ID = getInt("manager_ID");
        Connection con = ConnectionFactory.getMySQLConnection();

        try (Statement stmt = con.createStatement()) {

            String query1 = "SELECT * from employees WHERE employee_ID %2 !=0 or manager_ID %2 != 0 ";
            ResultSet rs1 = stmt.executeQuery(query1);
            while (rs1.next()) {
                System.out.println(rs1);
            }
            rs1.close();
            String query2 = "SELECT * from employees WHERE first_name like 'David'";
            ResultSet rs2 = stmt.executeQuery(query2);
            while (rs2.next()) {
                System.out.println(rs2);
            }
            rs2.close();
            String query3 = "SELECT * from employees WHERE department_id = 54 and salary> 5000";
            ResultSet rs3 = stmt.executeQuery(query3);
            while (rs3.next()) {
                System.out.println(rs3);
            }
            rs3.close();
            String query4 = "SELECT * from employees WHERE last_name like '%d'";
            ResultSet rs4 = stmt.executeQuery(query4);
            while (rs4.next()) {
                System.out.println(rs4);
            }
            rs4.close();
            String query5 = "SELECT * from employees WHERE salary >=2000 and salary <=4000";
            ResultSet rs5 = stmt.executeQuery(query5);
            while (rs5.next()) {
                System.out.println(rs5);
            }
            rs5.close();

            String query6 = "SELECT * from employees WHERE region_name = (Europe)";
            ResultSet rs6 = stmt.executeQuery(query6);
            while (rs6.next()) {
                System.out.println(rs6);
            }
            rs6.close();
            String query7 = "SELECT manager_ID from employees WHERE (employee_id = manager_id) >6";
            ResultSet rs7 = stmt.executeQuery(query7);
            while (rs7.next()) {
                System.out.println(rs7);
            }
            rs7.close();
            String query8 = "SELECT employee_ID from employees WHERE employee_id = manager_id and salary >10000";
            ResultSet rs8 = stmt.executeQuery(query8);
            while (rs8.next()) {
                System.out.println(rs8);
            }
            rs8.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
