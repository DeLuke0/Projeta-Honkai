package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Usuario;
import com.PI.Honkai.StarRail.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    @Autowired
    UsuarioService us;
    
    @GetMapping("/login") 
    public String loginUsuario(Model model) { 
        model.addAttribute("listaUsuarios", us.listarTodosUsuarios()); 
        return "login"; 
    }
    
    @GetMapping("/cadastro") 
    public String cadastroUsuario(Model model) { 
        model.addAttribute("usuario", new Usuario()); 
        return "cadastro"; 
    }
    
    @PostMapping("/cadastro") 
    public String cadastrarUsuario(@ModelAttribute Usuario usuario, Model model) { 
        us.criarUsuario(usuario);
        return "redirect:/login"; 
    }
}
