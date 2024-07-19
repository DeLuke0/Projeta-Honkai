package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.service.ReliquiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReliquiaController {
    @Autowired
    ReliquiaService rs;
    
    @GetMapping("/reliquias") 
    public String listaReliquias(Model model) { 
        model.addAttribute("listaReliquias", rs.listarTodasReliquias()); 
        return "reliquias"; 
    }
    
    @GetMapping("/reliquiaPg") 
    public String listaReliquia(Model model, @RequestParam String idReliquia) { 
        Integer id = Integer.parseInt(idReliquia);
        model.addAttribute("listaReliquias", rs.getReliquiaId(id)); 
        return "reliquiaPg"; 
    }
}
