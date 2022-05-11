package kuis1_jam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String DB = "jam";
    public static final String MYCONN = "jdbc:mysl://localhost/"+DB;
    public static Connection getConnection () throws SQLException{
        
        Connection con = (Connection) DriverManager.getConnection(MYCONN, USERNAME, PASSWORD);
        
                
                
        return con;
    }

    public static Connection getConnection(String driver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}