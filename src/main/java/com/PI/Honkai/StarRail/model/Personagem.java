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
@Table(name="Personagem") 
public class Personagem {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @NotBlank(message="Nome obrigatório") 
    private String Nome;
    @NotBlank(message="Material obrigatório") 
    private String Material1;
    @NotBlank(message="Material obrigatório") 
    private String Material2;
    @NotBlank(message="Material obrigatório") 
    private String Material3;
    @NotBlank(message="Material obrigatório") 
    private String Material4;
    @NotBlank(message="Material obrigatório") 
    private String Material5;
    @NotBlank(message="Material obrigatório") 
    private String Material6;
    @NotBlank(message="Material obrigatório") 
    private String Material7;
    @NotBlank(message="Material obrigatório") 
    private String Material8;
    @NotBlank(message="Material obrigatório") 
    private String Material9;
    @NotBlank(message="Material obrigatório") 
    private String Material10;
    @NotBlank(message="Material obrigatório") 
    private String Material11;
    @NotBlank(message="Material obrigatório") 
    private String Material12;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica1;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica2;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica3;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica4;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica5;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica6;
    @NotBlank(message="Estatistica obrigatória") 
    private String Estatistica7;
}
