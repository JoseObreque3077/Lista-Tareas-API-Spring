package com.example.listatareas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(nullable = false, unique = true, length = 75)
    private String tituloTarea;

    @Column(nullable = false, length = 300)
    private String descripcionTarea;

    @Column(nullable = false)
    private LocalDate fechaLimite;

    @Column(nullable = false)
    private Boolean activa = false;

    @Transient
    public String getEstado() {
        if (LocalDate.now().isBefore(fechaLimite.minusDays(3))) {
            return "tarea-regular";
        } else if (LocalDate.now().isAfter(fechaLimite)) {
            return "tarea-atrasada";
        } else {
            return "tarea-proxima";
        }
    }
}