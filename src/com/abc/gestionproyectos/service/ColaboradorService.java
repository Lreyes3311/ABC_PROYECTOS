/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.gestionproyectos.service;

import com.abc.gestionproyectos.dao.ColaboradorDAO;
import com.abc.gestionproyectos.model.Colaborador;
import java.util.List;

/**
 *
 * @author lreye
 */
public class ColaboradorService {
    
    private ColaboradorDAO colaboradorDAO;

    public ColaboradorService() {
        this.colaboradorDAO = new ColaboradorDAO();
    }

    public void agregarColaborador(Colaborador colaborador) {
        colaboradorDAO.agregarColaborador(colaborador);
    }

    public void actualizarColaborador(Colaborador colaborador) {
        colaboradorDAO.actualizarColaborador(colaborador);
    }

    public void eliminarColaborador(int idColaborador) {
        colaboradorDAO.eliminarColaborador(idColaborador);
    }

    public Colaborador obtenerColaboradorPorId(int idColaborador) {
        return colaboradorDAO.obtenerColaboradorPorId(idColaborador);
    }

    public List<Colaborador> obtenerTodosLosColaboradores() {
        return colaboradorDAO.obtenerTodosLosColaboradores();
    }
}
