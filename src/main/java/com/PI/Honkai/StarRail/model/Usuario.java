package com.PI.Honkai.StarRail.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String confirmarSenha;
}
