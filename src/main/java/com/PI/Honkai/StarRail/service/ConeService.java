package com.PI.Honkai.StarRail.service;
import com.PI.Honkai.StarRail.exception.ResourceNotFoundException;
import com.PI.Honkai.StarRail.model.Cone;
import com.PI.Honkai.StarRail.repository.ConeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConeService {
    @Autowired
    ConeRepository cr;
    
    public Cone getConeId(Integer cId) {
        return cr.findById(cId).orElseThrow(() -> new ResourceNotFoundException("Cone não encontrado " + cId));
    }
    
    public List<Cone> listarTodosCones(){
        return cr.findAll();
    }
}
