/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aspa_menu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CL2-PC
 */
public class Msconnect {
     public static Connection conn() {

        try {

            String url = "jdbc:ucanaccess:C://Users/CL2-PC/Downloads/crud_access-main/crud_access-main/lala.accdb";

            Connection conn = DriverManager.getConnection(url);

            return conn;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                null,
                "Database Connection Error:\n" + e.getMessage()
            );

            return null;
        }
    }
    
}
