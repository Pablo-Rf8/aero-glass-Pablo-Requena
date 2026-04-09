package com.alejandromax.primeraPractica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatosController {

    @GetMapping("/datos")
    public String mostrarDatos(Model model) {
        model.addAttribute("Nombre", "Pablo David");
        model.addAttribute("Apellido", "Requena Mollinedo");
        model.addAttribute("Edad", 19);
        return "datos";
    }
}