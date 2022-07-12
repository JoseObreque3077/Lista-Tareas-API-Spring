package com.example.listatareas.repository;

import com.example.listatareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}