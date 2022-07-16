package com.example.listatareas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
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

    @NotEmpty(message = "Este campo es obligatorio")
    @Length(message = "Este campo acepta entre 3 y 75 caracteres", min = 3, max = 75)
    @NotNull(message = "Este campo es obligatorio")
    @Column(nullable = false, unique = true, length = 75)
    private String tituloTarea;

    @NotEmpty(message = "Este campo es obligatorio")
    @Length(message = "Este campo acepta entre 3 y 300 caracteres", min = 3, max = 300)
    @NotNull(message = "Este campo es obligatorio")
    @Column(nullable = false, length = 300)
    private String descripcionTarea;

    @NotNull(message = "Este campo es obligatorio")
    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaLimite;

    @Column(nullable = false)
    private Boolean activa;

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