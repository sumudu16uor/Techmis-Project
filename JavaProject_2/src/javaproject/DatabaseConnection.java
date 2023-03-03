package javaproject;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author others
 */
public class DatabaseConnection {
    private void registerDriver(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(" Error in registerDriver");
        }
     
    }

    public Connection myConnection(){
            registerDriver();
            Connection myConnection = null;
            String url = "jdbc:mysql://localhost:3306/SMS7";
            String user = "root";
            String pw = "";
            
        try {
            myConnection = DriverManager.getConnection(url, user, pw);
            
        } catch (SQLException ex) {
            System.out.println("Error in connection");
        }
        return myConnection;
        
    }

    
    
}
