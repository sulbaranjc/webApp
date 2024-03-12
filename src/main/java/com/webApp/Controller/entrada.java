package com.webApp.Controller;

import Codigo.GestorEjemplo;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class entrada {
    @GetMapping("/index")
    public String index(Model model) {
        GestorEjemplo ge = new GestorEjemplo ();
        String valorfinal="./index";
        model.addAttribute("numeroAleatorio", ge.randomNum());
        return valorfinal;
    }

}
