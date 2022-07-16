package com.example.listatareas.repository;

import com.example.listatareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
    /**
     * Busca un registro en la tabla "tareas" según su título.
     * @param tituloTarea Título de la tarea a buscar en la base de datos.
     * @return Retorna un objeto Optional con el registro encontrado (o no).
     */
    Optional<Tarea> findTareaByTituloTarea(String tituloTarea);
}