package Ejercicio2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnector {
    private Connection conn;

    public DbConnector() throws SQLException{
        conn = DriverManager.getConnection("url","user","password");
    }

    public ResultSet select (String consulta) throws  SQLException{
        return conn.prepareStatement(consulta).executeQuery();
    }

    public int update(String consulta) throws SQLException{
        return conn.prepareStatement(consulta).executeUpdate();
    }
}

