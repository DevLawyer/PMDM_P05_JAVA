/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author migva
 */
public class NavigationQuery {
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rset = null;
    
    
    public static void startNavigation(){
        try {
            conn = AccessDB.getConnection();
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                        ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void setQuery(String query){
        try {
            rset = stmt.executeQuery(query);
            if(rset.next()){
                rset.beforeFirst();
            }
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void moveForward(){
        try {
            rset.next();
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void goBack(){
        try {
            rset.previous();
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void goFirst(){
        try {
            rset.first();
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void goLast(){
        try {
            rset.last();
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet getCurrent(){
        return rset;
    }
    
    public static boolean isFirst(){
        boolean first = false;
        
        try {
            first = rset.isFirst();
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return first;
    }
    
    public static boolean isLast(){
        boolean last = false;
        
        try {
            last = rset.isLast();
        } catch (SQLException ex) {
            Logger.getLogger(NavigationQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return last;
    }

    public static void close(){
        AccessDB.close(rset);
        AccessDB.close(stmt);
        AccessDB.close(conn);
    }
}
