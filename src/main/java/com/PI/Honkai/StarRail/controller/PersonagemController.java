package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Personagem;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonagemController {
    List<Personagem> listaPersonagens = new ArrayList<>();
    
    @GetMapping("/index") 
    public String listaPersonagens(Model model) { 
        model.addAttribute("listaPersonagens", listaPersonagens); 
        return "index"; 
    }
    
    @GetMapping("/tierList") 
    public String listaTiers(Model model) { 
        model.addAttribute("listaPersonagens", listaPersonagens); 
        return "tierList"; 
    }
    
    @GetMapping("/personagemPg") 
    public String listaPersonagem(Model model) { 
        model.addAttribute("listaPersonagens", listaPersonagens); 
        return "personagemPg"; 
    }
}
