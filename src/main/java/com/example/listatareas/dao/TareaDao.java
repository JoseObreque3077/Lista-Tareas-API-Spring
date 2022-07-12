package com.example.listatareas.dao;

import com.example.listatareas.model.Tarea;

import java.util.List;

public interface TareaDao {
    void guardar(Tarea tarea);
    void actualizar(Tarea tarea);
    void eliminar(Integer id);
    Tarea buscar(Integer id);
    List<Tarea> listar();
}
