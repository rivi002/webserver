/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dumindu
 */
public class Dbconection {
    
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Test", "ead", "ead");//.getConnection("jdbc:derby://localhost:1527/sample");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
}
