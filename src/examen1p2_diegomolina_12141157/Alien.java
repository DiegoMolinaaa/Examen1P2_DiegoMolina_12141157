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
public class Alien extends ExtraTerrestre{
    private String planeta;

    public Alien() {
        super();
    }

    public Alien(String planeta, String nombre, String poder, String debilidad, boolean tieneEscuadron, int fuerza, int agFisica, int agMental) {
        super(nombre, poder, debilidad, tieneEscuadron, fuerza, agFisica, agMental);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Alien: "+super.toString() + "planeta=" + planeta + '}';
    }
    
}
