package com.PI.Honkai.StarRail.controller;
import com.PI.Honkai.StarRail.model.Cone;
import com.PI.Honkai.StarRail.service.ConeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cone")
public class ConeAPIController {
    @Autowired
    ConeService cs;
    
    @GetMapping("/listar") 
    public ResponseEntity<List> getAllCones() { 
        List<Cone> c = cs.listarTodosCones(); 
        return new ResponseEntity<>(c, HttpStatus.OK); 
    } 
    
    @GetMapping("/pesquisar/{id}") 
    public ResponseEntity<Cone> getConesById(@PathVariable Integer id) { 
        Cone c = cs.getConeId(id); 
        return new ResponseEntity<>(c, HttpStatus.OK); 
    }
}
