package com.PI.Honkai.StarRail.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="Reliquia") 
public class Reliquia{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @NotBlank(message="Nome obrigatório") 
    private String Nome;
    @NotBlank(message="Bônus de duas peças obrigatório") 
    private String Bonus1;
    private String Bonus2;
}
