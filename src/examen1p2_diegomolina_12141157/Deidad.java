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
public class Deidad extends ExtraTerrestre{
    private boolean tieneCreyentes;
    private String religion;

    public Deidad() {
        super();
    }

    public Deidad(boolean tieneCreyentes, String religion, String nombre, String poder, String debilidad, String heroeOVillano, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, heroeOVillano, tieneEscuadron, fuerza, agFisica, agMental);
        this.tieneCreyentes = tieneCreyentes;
        this.religion = religion;
    }
    

    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return "Deidad: "+super.toString() + "tieneCreyentes=" + tieneCreyentes + ", religion=" + religion + '}';
    }

    @Override
    public void final_Chance(Persona p1, Persona p2) {
        
    }
    
}
