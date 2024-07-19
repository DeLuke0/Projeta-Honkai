package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonagemController {
    @Autowired
    PersonagemService ps;
    
    @GetMapping("/index") 
    public String listaPersonagens(Model model) { 
        model.addAttribute("listaPersonagens", ps.listarTodosPersonagens()); 
        return "index"; 
    }
    
    @GetMapping("/tierList") 
    public String listaTiers(Model model) { 
        model.addAttribute("listaPersonagens", ps.listarTodosPersonagens()); 
        return "tierList"; 
    }
    
    @GetMapping("/personagemPg") 
    public String listaPersonagem(Model model, @RequestParam String idPersonagem) { 
        Integer id = Integer.parseInt(idPersonagem);
        model.addAttribute("listaPersonagens", ps.getPersonagemId(id)); 
        return "personagemPg"; 
    }
}
