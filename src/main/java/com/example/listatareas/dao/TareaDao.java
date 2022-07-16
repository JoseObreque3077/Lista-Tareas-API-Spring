package com.example.listatareas.dao;

import com.example.listatareas.model.Tarea;

import java.util.List;
import java.util.Optional;

public interface TareaDao {
    void guardar(Tarea tarea);
    void actualizar(Tarea tarea);
    void eliminar(Integer id);
    Tarea buscar(Integer id);
    List<Tarea> listar();
    Optional<Tarea> buscarPorTitulo(String tituloTarea);
}
