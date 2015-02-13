/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Log_in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jurijs
 */
public class MySQLConnection {

    Connection conn = null;

    public static Connection ConnectDB() throws ClassNotFoundException {

        Tunnel t = new Tunnel();
        try {
            t.go();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try // open the connection to the MySQL server
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:9080/w1439058_0", "w1439058", "Sz2eZkchSIXI");

        } catch (SQLException e) {
            System.out.println("ERROR: MySQL Connection Failed!");
            e.printStackTrace();
            return null;
        }
        System.out.println("Database connected!");
     
        return null;

    }

}
