package com.example.listatareas.controller;

import com.example.listatareas.dao.TareaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Autowired
    private TareaDao dao;

    @GetMapping("")
    public String inicio(Model model) {
        model.addAttribute("tareas", dao.listar());
        return "/paginas/listado";
    }
}
