package com.PI.Honkai.StarRail.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
@Table(name="Usuario") 
public class Usuario {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotBlank(message="Nome obrigatório") 
    private String nome;
    @NotBlank(message="E-mail obrigatório") 
    private String email;
    @NotBlank(message="Senha obrigatória") 
    private String senha;
    @NotBlank(message="Confirmação de senha obrigatória") 
    private String confirmarSenha;
}
