package com.example.listatareas.api;

import com.example.listatareas.dao.TareaDao;
import com.example.listatareas.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TareaApi {

    @Autowired
    private TareaDao dao;

    //Busca una tarea en específico usando el ID, mediante una petición GET
    @GetMapping("/tarea/{id}")
    public Tarea buscarTarea(@PathVariable Integer id) {
        return dao.buscar(id);
    }

    //Busca todas las tareas, mediante una petición GET
    @GetMapping("/tareas")
    public List<Tarea> buscarTareas() {
        return dao.listar();
    }

    //Guarda una tarea, mediante una petición POST
    @PostMapping("/tarea")
    public void guardarTarea(@RequestBody Tarea tarea) {
        dao.guardar(tarea);
    }

    //Actualiza una tarea en específico usando su ID, mediante una petición PUT
    @PutMapping("/tarea/{id}")
    public void actualizarTarea(@PathVariable Integer id, @RequestBody Tarea tarea) {
        tarea.setId(id);
        dao.actualizar(tarea);
    }

    //Elimina una tarea en específico usando su ID, mediante una petición DELETE
    @DeleteMapping("tarea/{id}")
    public void eliminarTarea(@PathVariable Integer id) {
        dao.eliminar(id);
    }

}
