/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progiciel_cryptool;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




/**
 *
 * @author DELL
 */
public class ConnectionDB {
    Connection conn = null;
    public static Connection getConnection() throws Exception {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/utilisateur_db?serverTimezone=UTC","root","");
            //JOptionPane.showMessageDialog(null, "Connexion base de données réussite");
            return conn;
        } catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
           return null;
        }
        
        
    }
    
}
