package librarymanagementsystem;

import java.sql.*;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "2022100960Romeo";
    private static Connection connection;
    
    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException ex) {
            System.err.println("Database Connection: " + ex.getMessage());
        }
        
        return connection;
    }
}
