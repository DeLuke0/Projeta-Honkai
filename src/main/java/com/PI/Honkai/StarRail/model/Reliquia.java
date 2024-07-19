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
@Table(name="Reliquia") 
public class Reliquia {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @NotBlank(message="Nome obrigatório") 
    private String Nome;
    @NotBlank(message="Tipo obrigatório") 
    private String Tipo;
    @NotBlank(message="Bônus obrigatório") 
    public static ArrayList<String> Bonus = new ArrayList();
}
