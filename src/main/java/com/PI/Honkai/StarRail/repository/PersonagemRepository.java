package com.PI.Honkai.StarRail.repository;
import com.PI.Honkai.StarRail.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
    Personagem findById(int id);
}
