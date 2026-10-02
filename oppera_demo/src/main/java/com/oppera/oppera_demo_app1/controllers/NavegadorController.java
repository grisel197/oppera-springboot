package com.oppera.oppera_demo_app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping

public class NavegadorController {

    @GetMapping("/")
    public String raiz() {
        return "redirect:/iniciar-sesion";
    }

    @GetMapping("/iniciar-sesion")
    public String iniciosesion(Model acceso) {
        List<String[]> usuariosValidos = new ArrayList<>();
        usuariosValidos.add(new String[] { "admin@utp.edu.pe", "123", "administrador" });
        usuariosValidos.add(new String[] { "usuario@utp.edu.pe", "123", "usuario" });

        acceso.addAttribute("usuarios", usuariosValidos);
        return "inicio-sesion";
    }

    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/servicios")
    public String servicios() {
        return "servicios";
    }

    @GetMapping("/cotizador")
    public String cotizador() {
        return "cotizador";
    }

    @GetMapping("/contactanos")
    public String contactanos(Model model) {
        List<String> servicios = List.of("Concierto", "Teatro", "Evento privado", "Otro");
        model.addAttribute("servicios", servicios);
        return "contactanos";
    }

    @GetMapping("/testimonios")
    public String testimonios() {
        return "testimonios";
    }
}
