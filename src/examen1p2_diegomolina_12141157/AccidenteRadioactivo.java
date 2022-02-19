/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_diegomolina_12141157;

import java.util.Random;

/**
 *
 * @author diego
 */
public class AccidenteRadioactivo extends Persona{
    Random r = new Random();
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
        if(p1 instanceof AccidenteRadioactivo){
            int x = 0+r.nextInt(2);
            if(x==0){
               p1.setFuerza(p1.getFuerza()*4);
            }
            else if(x==1){
                p1.setAgFisica(p1.getAgFisica()*4);
            }
            else if(x==2){
                p1.setAgMental(p1.getAgMental()*4);
            }
        } 
    }
    
}
