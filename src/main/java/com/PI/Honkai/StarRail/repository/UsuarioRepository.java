package com.PI.Honkai.StarRail.repository;
import com.PI.Honkai.StarRail.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findById(int id);
    
    Usuario findByNome(String nome); 
}
