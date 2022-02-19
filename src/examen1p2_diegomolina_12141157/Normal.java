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
public class Normal extends Persona{
    Random r = new Random();
    public Normal() {
        super();
    }

    public Normal(String nombre, String poder, String debilidad, String heroeOVillano, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, heroeOVillano, tieneEscuadron, fuerza, agFisica, agMental);
    }

    @Override
    public String toString() {
        return "Normal:"+ super.toString();
    }
    @Override
    public void final_Chance(Persona p1, Persona p2) {
        if(p1 instanceof Normal){
            int x = 0+r.nextInt(2);
            if(x==0){
               p1.setFuerza(p1.getFuerza()+(p1.getFuerza()/2));
            }
            else if(x==1){
                p1.setAgFisica(p1.getAgFisica()+(p1.getAgFisica()/2));
            }
            else if(x==2){
                p1.setAgMental(p1.getAgMental()+(p1.getAgMental()/2));
            }
        }
    }
    
}
