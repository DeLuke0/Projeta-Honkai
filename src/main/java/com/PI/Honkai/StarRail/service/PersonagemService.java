package com.PI.Honkai.StarRail.service;
import com.PI.Honkai.StarRail.exception.ResourceNotFoundException;
import com.PI.Honkai.StarRail.model.Personagem;
import com.PI.Honkai.StarRail.repository.PersonagemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {
    @Autowired
    PersonagemRepository pr;
    
    public Personagem getPersonagemId(Integer pId) {
        return pr.findById(pId).orElseThrow(() -> new ResourceNotFoundException("Personagem não encontrado " + pId));
    }
    
    public List<Personagem> listarTodosPersonagens(){
        return pr.findAll();
    }
}
