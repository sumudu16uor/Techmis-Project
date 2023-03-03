/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.sql.Connection;

/**
 *
 * @author others
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection con = databaseConnection.myConnection();
        
        login login1 = new login();
        login1.show();
    }

   
    
}
