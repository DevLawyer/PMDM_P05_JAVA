package Controller;

import Model.Employee;
import java.sql.*;
import java.util.ArrayList;

public class ListQuery {
    
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rset = null;
    private static ArrayList list;
     
    public static ArrayList getDBData(String query){
        try{
            list = new ArrayList();
            conn = AccessDB.getConnection();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                        ResultSet.CONCUR_READ_ONLY);

            rset = stmt.executeQuery(query);
            
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
            rset.close();
        }catch(SQLException e){
            System.out.println("Error al conectar con la BBDD.");
        }  
        AccessDB.close(rset);
        AccessDB.close(stmt);
        AccessDB.close(conn);
        return list;
    }
    
    public static ArrayList getDBField(String query){
        try{
            list = new ArrayList();
            conn = AccessDB.getConnection();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                  ResultSet.CONCUR_READ_ONLY);

            rset = stmt.executeQuery(query);
            
            while(rset.next()){
                list.add(rset.getString(1));
            }
            rset.close();
        }catch(SQLException e){
            System.out.println("Error al conectar con la BBDD.");
        }  
        AccessDB.close(rset);
        AccessDB.close(stmt);
        AccessDB.close(conn);
        return list;
    }
    
}   
