/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.gestionproyectos.service;

import com.abc.gestionproyectos.dao.ProyectoDAO;
import com.abc.gestionproyectos.model.Proyecto;
import java.util.List;

/**
 *
 * @author lreye
 */
public class ProyectoService {
    
     private ProyectoDAO proyectoDAO;

    public ProyectoService() {
        this.proyectoDAO = new ProyectoDAO();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectoDAO.agregarProyecto(proyecto);
    }

    public void actualizarProyecto(Proyecto proyecto) {
        proyectoDAO.actualizarProyecto(proyecto);
    }

    public void eliminarProyecto(int idProyecto) {
        proyectoDAO.eliminarProyecto(idProyecto);
    }

    public Proyecto obtenerProyectoPorId(int idProyecto) {
        return proyectoDAO.obtenerProyectoPorId(idProyecto);
    }

    public List<Proyecto> obtenerTodosLosProyectos() {
        return proyectoDAO.obtenerTodosLosProyectos();
    }
    
}
