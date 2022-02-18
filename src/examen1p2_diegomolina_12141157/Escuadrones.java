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
public class Escuadrones {
    private String nombre;
    private String base;
    private Persona lider;
    private boolean heroes;
    private ArrayList<Persona> miembros = new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre, String base, boolean heroes) {
        this.nombre = nombre;
        this.base = base;
        this.heroes = heroes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean getTipo() {
        return heroes;
    }

    public void setTipo(boolean heroes) {
        this.heroes = heroes;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadrones{" + "nombre=" + nombre + ", base=" + base + ", miembros=" + miembros + '}';
    }
    
}
