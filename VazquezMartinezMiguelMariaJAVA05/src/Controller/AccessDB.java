/**
* 
* @author Miguel Maria Vazquez Martinez
* Fifth practice of module PMDM.
* 
*/

package Controller;

import java.sql.*;

public class AccessDB {

    private static AccessDB ref = new AccessDB();

    private AccessDB() {
        /**
         * This method obtain the class of the data base cliente driver to access it.
         */
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");	
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } 
    }


    public static Connection getConnection() throws SQLException {
        /**
         * This method create the connection with the data base passed as parameter
         * the url of local data base host, the user and the password.
         */
        String url = "jdbc:derby://localhost:1527/Empresa";
        return DriverManager.getConnection(url,"empleado","empleado");
    } 
    
    public static void close(ResultSet rs) {
        /**
         * This method close the resultset which send as a parameter.
         * @param rs will close by this method. 
         */
        try {
            rs.close();
        } catch (Exception ignored) {}
    } 

    public static void close(Statement stmt) {
        /**
         * This method close the statement which send as a paremeter.
         * @param stmt will close by this method. 
         */
        try {
            stmt.close();
        } catch (Exception ignored) {}
    } 

    public static void close(Connection conn) {
        /**
         * This method close the connection with the date base which send as a paremeter.
         * @param conn will close by this method. 
         */
        try {
            conn.close();
        } catch (Exception ignored) {}
    } 
}
