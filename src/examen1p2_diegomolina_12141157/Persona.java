/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_diegomolina_12141157;

/**
 *
 * @author diego
 */
public class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private boolean tieneEscuadron;
    private int fuerza;
    private int agFisica;
    private int agMental;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.tieneEscuadron = tieneEscuadron;
        this.fuerza = fuerza;
        this.agFisica = agFisica;
        this.agMental = agMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgFisica() {
        return agFisica;
    }

    public void setAgFisica(int agFisica) {
        this.agFisica = agFisica;
    }

    public int getAgMental() {
        return agMental;
    }

    public void setAgMental(int agMental) {
        this.agMental = agMental;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", tieneEscuadron=" + tieneEscuadron + ", fuerza=" + fuerza + ", agFisica=" + agFisica + ", agMental=" + agMental + '}';
    }
    
}
