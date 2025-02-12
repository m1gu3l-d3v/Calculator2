/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALE
 */
public class Conexion {

    public static Connection getConection() {
        final var NOMBRE = "nombreBaseDeDatos";
        final var URL = "jdbc:mysql://localhost/" + NOMBRE;
        final var USUARIO = "root";
        final var CONTRASENIA = "*****";
        Connection cnx = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx = DriverManager.getConnection(URL, USUARIO, CONTRASENIA);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR NO SE PUDO CONECTAR A LA BASE DE DATOS: " + e.getMessage());
        }
        return cnx;

    }

}
