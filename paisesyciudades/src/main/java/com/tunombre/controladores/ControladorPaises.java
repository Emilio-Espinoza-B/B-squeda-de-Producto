package com.tunombre.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@Controller
public class ControladorPaises {

    private static HashMap<String, String> listaPaises = new HashMap<>();

    public ControladorPaises() {
        listaPaises.put("México", "Ciudad de México");
        listaPaises.put("Paraguay", "Asunción");
        listaPaises.put("Perú", "Lima");
        listaPaises.put("Costa Rica", "San Jose");
        listaPaises.put("Chile", "Santiago");
    }

    @GetMapping("/paises")
    public String obtenerTodosLosPaises(Model model) {
        model.addAttribute("paises", listaPaises.keySet());
        return "paises";
    }

    @GetMapping("/paises/{pais}")
    public String obtenerCapital(@PathVariable String pais, Model model) {
        String capital = listaPaises.get(pais);
        if (capital != null) {
            model.addAttribute("pais", pais);
            model.addAttribute("capital", capital);
        } else {
            model.addAttribute("mensaje", "País no encontrado");
        }
        return "capitales";
    }
}
