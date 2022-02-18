/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_diegomolina_12141157;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Universo {
    private String nombreUniverso;
    private ArrayList<Escuadrones> squads = new ArrayList();

    public Universo(String nombreUniverso) {
        this.nombreUniverso = nombreUniverso;
    }

    public Universo() {
    }

    public String getNombreUniverso() {
        return nombreUniverso;
    }

    public void setNombreUniverso(String nombreUniverso) {
        this.nombreUniverso = nombreUniverso;
    }

    public ArrayList<Escuadrones> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Escuadrones> squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombreUniverso=" + nombreUniverso + ", squads=" + squads + '}';
    }
    
}
