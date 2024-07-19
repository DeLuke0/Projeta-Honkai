package com.PI.Honkai.StarRail.repository;
import com.PI.Honkai.StarRail.model.Reliquia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReliquiaRepository extends JpaRepository<Reliquia, Integer> {
    Reliquia findById(int id);
}
