package org.example.domain;

import lombok.Data;
import org.example.dao.DinoList;

@Data
public class DinoEle {
    private String nombre;
    private String familia;
    private int id;

    public DinoEle(int id){
        this.id = id;
        familia
    }
}
