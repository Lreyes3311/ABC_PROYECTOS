/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.gestionproyectos.dao;

import com.abc.gestionproyectos.model.Tarea;
import java.util.List;

/**
 *
 * @author lreye
 */
public class TareaDAO {
    
       public void agregarTarea(Tarea tarea) {
        // Lógica para agregar una tarea a la base de datos
    }
    
    public void actualizarTarea(Tarea tarea) {
        // Lógica para actualizar una tarea en la base de datos
    }
    
    public void eliminarTarea(int idTarea) {
        // Lógica para eliminar una tarea de la base de datos
    }
    
    public Tarea obtenerTareaPorId(int idTarea) {
        // Lógica para obtener una tarea por su ID de la base de datos
        return null;
    }
    
    public List<Tarea> obtenerTareasPorProyecto(int idProyecto) {
        // Lógica para obtener todas las tareas de un proyecto de la base de datos
        return null;
    }
}
