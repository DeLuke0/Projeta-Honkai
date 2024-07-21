package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Cone;
import com.PI.Honkai.StarRail.service.ConeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ConeController {    
    @Autowired
    ConeService cs;
    
    @GetMapping("/cones") 
    public String listaCones(Model model) { 
        model.addAttribute("listaCones", cs.listarTodosCones()); 
        return "cones"; 
    }
    
    @GetMapping("/conePg/{id}") 
    public String listaCone(@PathVariable(value = "id") Integer id, Model model) { 
        Cone c = cs.getConeId(id);
        model.addAttribute("cone", c); 
        return "conePg"; 
    }
}
