package com.example.listatareas.controller;

import com.example.listatareas.dao.TareaDao;
import com.example.listatareas.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
public class WebController {
    @Autowired
    private TareaDao dao;

    @GetMapping("")
    public String inicio(Model model) {
        model.addAttribute("tareas", dao.listar());
        return "/paginas/listado";
    }
    @GetMapping("/tarea/nueva-tarea")
    public String nuevaTarea(Tarea tarea, Model model) {
        model.addAttribute("tarea", tarea);
        model.addAttribute("fechaHoy", LocalDate.now());
        return "/paginas/formulario";
    }

    @PostMapping("tarea/tarea-nueva")
    public String crearNuevaTarea(@Valid Tarea tarea, BindingResult bindingResult, Model model) {

        return "redirect:/";
    }
}
