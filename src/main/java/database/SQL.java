package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class SQL {

    public static void excecute(String sql) {
        try (Connection conn = Oracle.conectar(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Consulta ejecutada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
