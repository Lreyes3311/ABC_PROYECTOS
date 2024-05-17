/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.gestionproyectos.dao;

import com.abc.gestionproyectos.model.Proyecto;
import com.abc.gestionproyectos.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lreye
 */
public class ProyectoDAO {
    
        public void agregarProyecto(Proyecto proyecto) {
        // Lógica para agregar un proyecto a la base de datos
        String sql = "INSERT INTO Proyecto (nombre, descripcion, fechaInicio, fechaFinalizacion, costoEstimado) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, proyecto.getNombre());
            stmt.setString(2, proyecto.getDescripcion());
            stmt.setDate(3, new java.sql.Date(proyecto.getFechaInicio().getTime()));
            stmt.setDate(4, new java.sql.Date(proyecto.getFechaFinalizacion().getTime()));
            stmt.setDouble(5, proyecto.getCostoEstimado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void actualizarProyecto(Proyecto proyecto) {
        // Lógica para actualizar un proyecto en la base de datos
        String sql = "UPDATE Proyecto SET nombre = ?, descripcion = ?, fechaInicio = ?, fechaFinalizacion = ?, costoEstimado = ? WHERE idProyecto = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, proyecto.getNombre());
            stmt.setString(2, proyecto.getDescripcion());
            stmt.setDate(3, new java.sql.Date(proyecto.getFechaInicio().getTime()));
            stmt.setDate(4, new java.sql.Date(proyecto.getFechaFinalizacion().getTime()));
            stmt.setDouble(5, proyecto.getCostoEstimado());
            stmt.setInt(6, proyecto.getIdProyecto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminarProyecto(int idProyecto) {
        // Lógica para eliminar un proyecto de la base de datos
        String sql = "DELETE FROM Proyecto WHERE idProyecto = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idProyecto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Proyecto obtenerProyectoPorId(int idProyecto) {
        // Lógica para obtener un proyecto por su ID de la base de datos
        String sql = "SELECT * FROM Proyecto WHERE idProyecto = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idProyecto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setIdProyecto(rs.getInt("idProyecto"));
                proyecto.setNombre(rs.getString("nombre"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFechaInicio(rs.getDate("fechaInicio"));
                proyecto.setFechaFinalizacion(rs.getDate("fechaFinalizacion"));
                proyecto.setCostoEstimado(rs.getDouble("costoEstimado"));
                return proyecto;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<Proyecto> obtenerTodosLosProyectos() {
        // Lógica para obtener todos los proyectos de la base de datos
        String sql = "SELECT * FROM Proyecto";
        List<Proyecto> proyectos = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setIdProyecto(rs.getInt("idProyecto"));
                proyecto.setNombre(rs.getString("nombre"));
                proyecto.setDescripcion(rs.getString("descripcion"));
                proyecto.setFechaInicio(rs.getDate("fechaInicio"));
                proyecto.setFechaFinalizacion(rs.getDate("fechaFinalizacion"));
                proyecto.setCostoEstimado(rs.getDouble("costoEstimado"));
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proyectos;
    }
    
}
