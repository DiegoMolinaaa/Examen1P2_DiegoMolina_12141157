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
public class Mutante extends Persona{
    ArrayList<String> factoresMutantes = new ArrayList();

    public Mutante() {
        super();
    }

    public Mutante(String nombre, String poder, String debilidad, String heroeOVillano, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, heroeOVillano, tieneEscuadron, fuerza, agFisica, agMental);
    }
    
    public ArrayList<String> getFactoresMutantes() {
        return factoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> factoresMutantes) {
        this.factoresMutantes = factoresMutantes;
    }

    @Override
    public String toString() {
        return "Mutante{"+super.toString() + "factoresMutantes=" + factoresMutantes + '}';
    }

    @Override
    public void final_Chance(Persona p1, Persona p2) {
        
    }
    
}
