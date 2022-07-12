package com.example.listatareas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    private Date fechaLimite;

}