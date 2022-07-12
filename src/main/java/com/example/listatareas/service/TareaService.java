package com.example.listatareas.service;

import com.example.listatareas.dao.TareaDao;
import com.example.listatareas.model.Tarea;
import com.example.listatareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService implements TareaDao {

    @Autowired
    private TareaRepository repo;


    @Override
    public void guardar(Tarea tarea) {
        repo.save(tarea);
    }

    @Override
    public void actualizar(Tarea tarea) {
        repo.save(tarea);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Tarea buscar(Integer id) {
        return repo.findById(id).orElseThrow();
    }

    @Override
    public List<Tarea> listar() {
        return repo.findAll();
    }
}
