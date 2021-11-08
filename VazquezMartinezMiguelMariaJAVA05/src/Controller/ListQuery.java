/**
* 
* @author Miguel Maria Vazquez Martinez
* Fifth practice of module PMDM.
* 
*/

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
        /**
         * This method receive as a parameter a query for the data base to create
         * an arraylist with the rows and return it.
         * 
         * @param query is the String which send as a query to the data base.
         * @return list with the content of the result of the query.
         */
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
        /**
         * This method recieve a query for obtain of the data base one and only one
         * field of a table.
         * 
         * @param query is the String which send as a query to the data base.
         * @return list with the content of the result of the query.
         */
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
