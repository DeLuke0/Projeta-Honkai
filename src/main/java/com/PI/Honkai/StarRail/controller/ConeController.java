package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Cone;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConeController {
    List<Cone> listaCones = new ArrayList<>();  
    
    @GetMapping("/cones") 
    public String listaCones(Model model) { 
        model.addAttribute("listaCones", listaCones); 
        return "cones"; 
    }
    
    @GetMapping("/conePg") 
    public String listaCone(Model model) { 
        model.addAttribute("listaCones", listaCones); 
        return "conePg"; 
    }
}
