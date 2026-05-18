package org.example.domain;

import lombok.Data;
import org.example.common.Constantes;
import org.example.dao.DinoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Data
public class DinoEle {
    private String nombre;
    private String familia;
    private int id;

    public DinoEle(int id) {
        Random rand = new Random();
        this.id = id;
        familia = Constantes.FAMILIASDINOSAURIOS[rand.nextInt(Constantes.FAMILIASDINOSAURIOS.length)];
        nombre = Constantes
    }
}
