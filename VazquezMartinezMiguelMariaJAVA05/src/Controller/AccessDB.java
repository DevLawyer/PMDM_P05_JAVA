package Controller;

import java.sql.*;

public class AccessDB {

    private static AccessDB ref = new AccessDB();

    private AccessDB() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");	
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: exception loading driver class");
        } 
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:derby://localhost:1527/empresa";
        return DriverManager.getConnection(url,"empleado","empleado");
    } 
}
