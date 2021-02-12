/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AIBLBank;

import Inventory.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAVA
 */
public class JDBCConnection {

    Connection con;
    public JDBCConnection() {
        createConnection();
    }
    
       public void createConnection() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Driver load
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking_system", 
                    "j2ee", "1234"); // connection establish
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql jdbc class not found exception"+e.getMessage());
        } catch(SQLException e) {
            System.out.println("Sql exception exception"+e.getMessage());
        }
    }
       public Connection getConnection(){
       
           return con;
       }
}
