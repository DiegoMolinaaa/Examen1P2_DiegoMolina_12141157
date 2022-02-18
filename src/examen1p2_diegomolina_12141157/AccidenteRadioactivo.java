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
public class AccidenteRadioactivo extends Persona{
    private int edadAccidente;
    private String tipoAccidente;

    public AccidenteRadioactivo() {
        super();
    }

    public AccidenteRadioactivo(int edadAccidente, String tipoAccidente, String nombre, String poder, String debilidad, String heroeOVillano, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, heroeOVillano, tieneEscuadron, fuerza, agFisica, agMental);
        this.edadAccidente = edadAccidente;
        this.tipoAccidente = tipoAccidente;
    }
    
    public int getEdadAccidente() {
        return edadAccidente;
    }

    public void setEdadAccidente(int edadAccidente) {
        this.edadAccidente = edadAccidente;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public String toString() {
        return "AccidenteRadioactivo: "+super.toString() + "edadAccidente=" + edadAccidente + ", tipoAccidente=" + tipoAccidente + '}';
    }

    @Override
    public void final_Chance(Persona p1, Persona p2) {
        
    }
    
}
