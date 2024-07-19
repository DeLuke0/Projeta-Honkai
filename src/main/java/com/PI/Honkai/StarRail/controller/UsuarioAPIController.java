package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Usuario;
import com.PI.Honkai.StarRail.service.UsuarioService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioAPIController {
    @Autowired
    UsuarioService us;
    
    @PostMapping("/adicionar") 
    public ResponseEntity<Usuario> addUsuarios(@Valid @RequestBody Usuario u) { 
        var novoU = us.criarUsuario(u); 
        return new ResponseEntity<>(novoU, HttpStatus.CREATED); 
    }
    
    @GetMapping("/listar") 
    public ResponseEntity<List> getAllUsuarios() { 
        List<Usuario> u = us.listarTodosUsuarios(); 
        return new ResponseEntity<>(u, HttpStatus.OK); 
    } 
    
    @GetMapping("/pesquisar-nome/{nome}") 
    public ResponseEntity<Usuario> getPesquisarPorNomeUsuarios(@PathVariable String nome) { 
        Usuario u = us.getUsuarioNome(nome); 
        return new ResponseEntity<>(u, HttpStatus.OK); 
    }
    
    @GetMapping("/pesquisar/{id}") 
    public ResponseEntity<Usuario> getUsuariosById(@PathVariable Integer id) { 
        Usuario u = us.getUsuarioId(id); 
        return new ResponseEntity<>(u, HttpStatus.OK); 
    } 
}
