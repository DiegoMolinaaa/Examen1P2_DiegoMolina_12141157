/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_diegomolina_12141157;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author diego
 */
public class Mutante extends Persona{
    Random r = new Random();
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
        if(p1 instanceof Mutante){
            int x = 0+r.nextInt(2);
            if(x==0){
               p1.setFuerza(p1.getFuerza()*4);
               int y = 0+r.nextInt(1);
               if(y==0){
                   p1.setAgFisica(p1.getFuerza()/2);
               }
               else if(y==1){
                   p1.setAgMental(p1.getAgMental()/2);
               }
            }
            else if(x==1){
                p1.setAgFisica(p1.getAgFisica()*4);
                int y = 0+r.nextInt(1);
                if(y==0){
                   p1.setAgFisica(p1.getFuerza()/2);
               }
               else if(y==1){
                   p1.setFuerza(p1.getFuerza()/2);
               }
            }
            else if(x==2){
                p1.setAgMental(p1.getAgMental()*4);
                int y = 0+r.nextInt(1);
                if(y==0){
                   p1.setAgFisica(p1.getFuerza()/2);
               }
               else if(y==1){
                   p1.setFuerza(p1.getFuerza()/2);
               }
            }
        }    
    }
    
}
