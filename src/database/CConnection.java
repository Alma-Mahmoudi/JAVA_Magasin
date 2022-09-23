/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
/**
 *
 * @author asus
 */
public class CConnection {
    
    public static CConnection getConnection() {
        CConnection conn=null ;
         try {
             Class.forName("com.mysql.jdbc.Driver");
            conn= (CConnection) DriverManager.getConnection("jdbc:mysql://localhost:3306/magasin","root","");
 
          }catch (Exception e) {
             System.out.println(e.getMessage()); 
          }
    return conn;
    } 

    public com.mysql.jdbc.PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
