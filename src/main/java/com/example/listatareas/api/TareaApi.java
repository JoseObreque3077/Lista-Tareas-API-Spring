package com.example.listatareas.api;

import com.example.listatareas.dao.TareaDao;
import com.example.listatareas.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TareaApi {

    @Autowired
    private TareaDao dao;

    //Busca una tarea en específico usando el ID, mediante una petición GET (para formulario de edición)
    @GetMapping("/tarea/{id}")
    public Tarea buscarTarea(@PathVariable Integer id) {
        return dao.buscar(id);
    }

    //Busca todas las tareas, mediante una petición GET (para listado de tareas)
    @GetMapping("/tareas")
    public List<Tarea> buscarTareas() {
        return dao.listar();
    }

    //Guarda una tarea, mediante una petición POST (para guardar lo ingresado en formulario de nueva tarea)
    @PostMapping("/tarea")
    public void guardarTarea(@RequestBody Tarea tarea) {
        tarea.setActiva(true); //Una tarea nueva siempre comienza con un estado activo, hasta completarse
        dao.guardar(tarea);
    }

    //Actualiza una tarea en específico usando su ID, mediante una petición PUT (para actualizar una tarea, desde formulario de edición)
    @PutMapping("/tarea")
    public void actualizarTarea(@RequestBody Tarea tarea) {
        dao.actualizar(tarea);
    }

    //Elimina una tarea en específico usando su ID, mediante una petición DELETE (desde botón de eliminación)
    @DeleteMapping("tarea/{id}")
    public void eliminarTarea(@PathVariable Integer id) {
        dao.eliminar(id);
    }

}
