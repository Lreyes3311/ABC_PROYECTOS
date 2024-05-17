/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.gestionproyectos.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lreye
 */
public class DatabaseConnection {
    
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ABC_PROYECTOS";
    //private static final String URL = "Server=localhost;Database=ABC_PROYECTOS;Trusted_Connection=True;MultipleActiveResultSets=true;TrustServerCertificate=True";
    private static final String USER = "";
    private static final String PASSWORD = "";
    
    //Metodo para obtener una conexion a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            if(conn != null){
                System.out.println("Conexion exitosa a la base de datos!");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
