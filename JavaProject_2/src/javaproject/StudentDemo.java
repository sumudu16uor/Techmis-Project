/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author others
 */
public class StudentDemo {
    String name , id;

    public StudentDemo(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public StudentDemo() {
    }
    
 

    private static class toSting {

        public toSting() {
        }
    }

    public void displyStudentDetails(Connection myconnection){
    Statement smt;
    
        try {
            smt = myconnection.createStatement();
            String myStatement = "select * from studentdemo";
             
            ResultSet rs = smt.executeQuery(myStatement); 
            System.out.println("id     name");
            while(rs.next()){
            id = rs.getString(2);
            name = rs.getString(1);
            
                System.out.println(id+"   "+name);
          }
        
        } catch (SQLException ex) {
            Logger.getLogger(StudentDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    
    }
            
}
