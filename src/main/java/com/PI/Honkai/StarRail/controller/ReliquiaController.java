package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Reliquia;
import com.PI.Honkai.StarRail.service.ReliquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ReliquiaController {
    @Autowired
    ReliquiaService rs;
    
    @GetMapping("/reliquias") 
    public String listaReliquias(Model model) { 
        model.addAttribute("listaReliquias", rs.listarTodasReliquias()); 
        return "reliquias"; 
    }
    
    @GetMapping("/reliquiaPg/{id}") 
    public String listaReliquia(Model model, @PathVariable(value = "id") Integer id) { 
        Reliquia r = rs.getReliquiaId(id);
        model.addAttribute("reliquia", r); 
        return "reliquiaPg"; 
    }
}
