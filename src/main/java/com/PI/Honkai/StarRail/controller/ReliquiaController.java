package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Reliquia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReliquiaController {
    List<Reliquia> listaReliquias = new ArrayList<>();
    
    @GetMapping("/reliquias") 
    public String listaReliquias(Model model) { 
        model.addAttribute("listaReliquias", listaReliquias); 
        return "reliquias"; 
    }
    
    @GetMapping("/reliquiaPg") 
    public String listaReliquia(Model model) { 
        model.addAttribute("listaReliquias", listaReliquias); 
        return "reliquiaPg"; 
    }
}
