/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author PC16
 */
public class conectar {
    Connection conect =null;
   public Connection conexion() {
       try{
        // cargamos driver,""
       Class.forName("com.mysql.jdbc.Driver");
       conect = DriverManager.getConnection("jdbc:mysql://localhost/java_mysql", "root","rootroot");
   } catch (Exception e) {
       JOptionPane.showMessageDialog(null,"Error de conexion LUIS hace algooooo "+ e);
   }
       return conect;
    }
}