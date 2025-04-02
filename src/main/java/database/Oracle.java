package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Oracle {

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private static final String USER = "ESTIVEN";
    private static final String PASSWORD = "1234";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
