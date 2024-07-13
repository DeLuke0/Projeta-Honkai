package com.PI.Honkai.StarRail.model;
import java.util.ArrayList;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personagem {
    private int ID;
    private String Nome;
    public static ArrayList<Reliquia> Reliquias = new ArrayList<>();
    public static ArrayList<Cone> Cones = new ArrayList<>();
    public static ArrayList<String> Materiais = new ArrayList<>();
    public static ArrayList<String> Estatisticas = new ArrayList<>();
    public static ArrayList<Personagem> ListaP = new ArrayList<>();
}
