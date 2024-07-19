package com.PI.Honkai.StarRail.service;
import com.PI.Honkai.StarRail.exception.ResourceNotFoundException;
import com.PI.Honkai.StarRail.model.Usuario;
import com.PI.Honkai.StarRail.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository ur;
    
    public Usuario criarUsuario(Usuario u) { 
        u.setId(null); 
        ur.save(u); 
        return u; 
    } 
    
    public Usuario getUsuarioId(Integer uId) {
        return ur.findById(uId).orElseThrow(() -> new ResourceNotFoundException("Usuario não encontrado " + uId));
    }
    
    public Usuario getUsuarioNome(String nome) { 
        return ur.findByNome(nome); 
    } 
    
    public List<Usuario> listarTodosUsuarios() {
        return ur.findAll();
    }
}
