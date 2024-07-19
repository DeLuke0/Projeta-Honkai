package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Reliquia;
import com.PI.Honkai.StarRail.service.ReliquiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reliquia")
public class ReliquiaAPIController {
    @Autowired
    ReliquiaService rs;
    
    @GetMapping("/listar") 
    public ResponseEntity<List> getAllReliquias() { 
        List<Reliquia> r = rs.listarTodasReliquias(); 
        return new ResponseEntity<>(r, HttpStatus.OK); 
    } 
    
    @GetMapping("/pesquisar/{id}") 
    public ResponseEntity<Reliquia> getReliquiasById(@PathVariable Integer id) { 
        Reliquia r = rs.getReliquiaId(id); 
        return new ResponseEntity<>(r, HttpStatus.OK); 
    }
}
