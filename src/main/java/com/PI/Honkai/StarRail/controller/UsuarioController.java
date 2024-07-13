package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    List<Usuario> listaUsuarios = new ArrayList<>();
    
    @GetMapping("/login") 
    public String loginUsuario(Model model) { 
        model.addAttribute("listaUsuarios", listaUsuarios); 
        return "login"; 
    }
    
    @GetMapping("/cadastro") 
    public String cadastroUsuario(Model model) { 
        model.addAttribute("usuario", new Usuario()); 
        return "cadastro"; 
    }
    
    @PostMapping("/cadastro") 
    public String cadastrarUsuario(@ModelAttribute Usuario usuario, Model model) { 
        usuario.setId(listaUsuarios.size()+1);
        listaUsuarios.add(usuario); 
        model.addAttribute("usuario", usuario); 
        return "redirect:/login"; 
    }
}
