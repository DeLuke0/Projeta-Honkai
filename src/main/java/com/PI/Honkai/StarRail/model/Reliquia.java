package com.PI.Honkai.StarRail.model;
import java.util.ArrayList;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reliquia {
    private int ID;
    private String Nome;
    private String Tipo;
    public static ArrayList<String> Bonus = new ArrayList();
}
