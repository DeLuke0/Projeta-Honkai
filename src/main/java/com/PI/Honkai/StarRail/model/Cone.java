package com.PI.Honkai.StarRail.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="Cone") 
public class Cone{
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    @NotBlank(message="Nome obrigatório") 
    private String Nome;
    @NotBlank(message="Descrição obrigatória") 
    private String Descricao;
    @NotBlank(message="Tipo obrigatório") 
    private String Tipo;
}
