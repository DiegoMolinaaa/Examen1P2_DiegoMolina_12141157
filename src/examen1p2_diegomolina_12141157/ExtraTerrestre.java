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
public class ExtraTerrestre extends Persona{

    public ExtraTerrestre() {
        super();
    }

    public ExtraTerrestre(String nombre, String poder, String debilidad, String heroeOVillano, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, heroeOVillano, tieneEscuadron, fuerza, agFisica, agMental);
    }
    

    @Override
    public String toString() {
        return "ExtraTerrestre:"+super.toString() + '}';
    }

    @Override
    public void final_Chance(Persona p1, Persona p2) {
         
    }
    
}
