lpackage com.savchenko.homeworks.hometask24;

import java.sql.*;

public class ConnectionFactory {

    private static final String DB_USER_NAME = "root";
    private static final String DB_USER_PASS = "password";
    private static final String DB_USER_HOST = "localhost";
    private static final String DB_USER_DATABASE = "employees";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getMySQLConnection() throws SQLException {

        String url = "jdbc:mysql://" + DB_USER_HOST + "/" + DB_USER_DATABASE + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        return DriverManager.getConnection(url, DB_USER_NAME, DB_USER_PASS);
    }
}




















