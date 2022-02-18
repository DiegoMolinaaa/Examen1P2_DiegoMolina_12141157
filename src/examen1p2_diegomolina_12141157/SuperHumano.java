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
public class SuperHumano extends Persona{
    private String superPoder;

    public SuperHumano() {
        super();
    }

    public SuperHumano(String superPoder, String nombre, String poder, String debilidad, String heroeOVillano, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, heroeOVillano, tieneEscuadron, fuerza, agFisica, agMental);
        this.superPoder = superPoder;
    }
    

    public String getSuperPoder() {
        return superPoder;
    }

    public void setSuperPoder(String superPoder) {
        this.superPoder = superPoder;
    }

    @Override
    public String toString() {
        return "SuperHumano: "+super.toString() + "superPoder=" + superPoder + '}';
    }

    @Override
    public void final_Chance(Persona p1, Persona p2) {
        
    }
    
}
