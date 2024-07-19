package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.service.ConeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConeController {    
    @Autowired
    ConeService cs;
    
    @GetMapping("/cones") 
    public String listaCones(Model model) { 
        model.addAttribute("listaCones", cs.listarTodosCones()); 
        return "cones"; 
    }
    
    @GetMapping("/conePg") 
    public String listaCone(Model model, @RequestParam String id) { 
        Integer idCone = Integer.parseInt(id);
        model.addAttribute("Cone", cs.getConeId(idCone)); 
        return "conePg"; 
    }
}
