/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.gestionproyectos.service;

import com.abc.gestionproyectos.dao.TareaDAO;
import com.abc.gestionproyectos.model.Tarea;
import java.util.List;

/**
 *
 * @author lreye
 */
public class TareaService {
    
    private TareaDAO tareaDAO;

    public TareaService() {
        this.tareaDAO = new TareaDAO();
    }

    public void agregarTarea(Tarea tarea) {
        tareaDAO.agregarTarea(tarea);
    }

    public void actualizarTarea(Tarea tarea) {
        tareaDAO.actualizarTarea(tarea);
    }

    public void eliminarTarea(int idTarea) {
        tareaDAO.eliminarTarea(idTarea);
    }

    public Tarea obtenerTareaPorId(int idTarea) {
        return tareaDAO.obtenerTareaPorId(idTarea);
    }

    public List<Tarea> obtenerTareasPorProyecto(int idProyecto) {
        return tareaDAO.obtenerTareasPorProyecto(idProyecto);
    }
}
