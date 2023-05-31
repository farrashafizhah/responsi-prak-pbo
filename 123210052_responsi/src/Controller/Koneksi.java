/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static Connection MySQLConfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/movie_db";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig
                    = DriverManager.getConnection(url, user, pass);
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println("Error"  + e.getMessage());
        }
        return MySQLConfig;
    }
}
 

