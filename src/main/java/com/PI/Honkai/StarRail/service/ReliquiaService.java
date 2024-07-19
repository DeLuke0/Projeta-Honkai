package com.PI.Honkai.StarRail.service;
import com.PI.Honkai.StarRail.exception.ResourceNotFoundException;
import com.PI.Honkai.StarRail.model.Reliquia;
import com.PI.Honkai.StarRail.repository.ReliquiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReliquiaService {
    @Autowired
    ReliquiaRepository rr;
    
    public Reliquia getReliquiaId(Integer rId) {
        return rr.findById(rId).orElseThrow(() -> new ResourceNotFoundException("Reliquia não encontrada " + rId));
    }
    
    public List<Reliquia> listarTodasReliquias(){
        return rr.findAll();
    }
}
