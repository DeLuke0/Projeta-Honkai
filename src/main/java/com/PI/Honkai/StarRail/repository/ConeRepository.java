package com.PI.Honkai.StarRail.repository;
import com.PI.Honkai.StarRail.model.Cone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConeRepository extends JpaRepository<Cone, Integer> {
    Cone findById(int id);
}
