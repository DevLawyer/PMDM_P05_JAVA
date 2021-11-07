package Controller;

import java.sql.*;

public class AccessDB {

    private static AccessDB ref = new AccessDB();

    private AccessDB() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");	
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } 
    }


    public static Connection getConnection() throws SQLException {
        String url = "jdbc:derby://localhost:1527/Empresa";
        return DriverManager.getConnection(url,"empleado","empleado");
    } 
    
    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (Exception ignored) {}
    } 

    public static void close(Statement stmt) {
        try {
            stmt.close();
        } catch (Exception ignored) {}
    } 

    public static void close(Connection conn) {
        try {
            conn.close();
        } catch (Exception ignored) {}
    } 
}
