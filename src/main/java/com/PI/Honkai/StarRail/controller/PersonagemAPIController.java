package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Personagem;
import com.PI.Honkai.StarRail.service.PersonagemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personagem")
public class PersonagemAPIController {
    @Autowired
    PersonagemService ps;
    
    @GetMapping("/listar") 
    public ResponseEntity<List> getAllPersonagens() { 
        List<Personagem> p = ps.listarTodosPersonagens(); 
        return new ResponseEntity<>(p, HttpStatus.OK); 
    } 
    @GetMapping("/pesquisar/{id}") 
    public ResponseEntity<Personagem> getPersonagensById(@PathVariable Integer id) { 
        Personagem p = ps.getPersonagemId(id); 
        return new ResponseEntity<>(p, HttpStatus.OK); 
    }
}
