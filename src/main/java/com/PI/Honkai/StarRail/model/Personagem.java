package com.PI.Honkai.StarRail.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="Personagem") 
public class Personagem {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @NotBlank(message="Nome obrigatório") 
    private String Nome;
    @NotBlank(message="Reliquias obrigatórias") 
    public static ArrayList<Reliquia> Reliquias = new ArrayList<>();
    @NotBlank(message="Cones obrigatórios") 
    public static ArrayList<Cone> Cones = new ArrayList<>();
    @NotBlank(message="Materiais obrigatórios") 
    public static ArrayList<String> Materiais = new ArrayList<>();
    @NotBlank(message="Estatisticas obrigatórias") 
    public static ArrayList<String> Estatisticas = new ArrayList<>();
}
