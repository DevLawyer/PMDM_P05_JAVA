package Controller;

import Model.Employee;
import java.sql.*;
import java.util.ArrayList;

public class ListQuery {
    
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rset = null;
    private static ArrayList<Employee> list = null;
     
    public static ArrayList getDBData(){
        try{
            conn = AccessDB.getConnection();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM empleado ORDER BY apellido";

            rset = stmt.executeQuery(sql);
            
            while(rset.next()){
                        
                Employee auxEmp = new Employee( rset.getString(1),
                                                rset.getString(2),
                                                rset.getString(3),
                                                rset.getString(4),
                                                rset.getString(5),
                                                rset.getString(6),
                                                rset.getString(7));
                
                list.add(auxEmp);
            }
        }catch(SQLException e){
            System.out.println("Error al conectar con la BBDD:");
        }  
        
        return list;
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
