package org.example.dao;

import org.example.domain.DinoEle;

import java.util.ArrayList;
import java.util.List;


public class DinoList {
    private List<DinoEle> lista;

    public DinoList(){
        lista = new ArrayList<DinoEle>();
        for (int i = 0; i < 100; i++) {
            lista.add(new DinoEle(i));
        }
    }

    public List<DinoEle> getListaElementos(){
        return lista;
    }

    public void insertarElemento(DinoEle element){
        lista.add(element);
    }

    public void eliminarElementoNombre(DinoEle element){
        lista.stream().toList().removeIf(d->d.getNombre().equalsIgnoreCase(element.getNombre()));
    }

    public boolean modificarElemento(DinoEle elemento1, DinoEle elemento) {
        boolean respuesta = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento1)){
                lista.get(i).setNombre(elemento.getNombre());
                lista.get(i).setFamilia(elemento.getFamilia());
                lista.get(i).setId(elemento.getId());
                respuesta = true;
            }
        }
        return respuesta;
    }



}
