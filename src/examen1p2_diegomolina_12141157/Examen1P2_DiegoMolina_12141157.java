/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_diegomolina_12141157;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Examen1P2_DiegoMolina_12141157 {
    static Scanner lea = new Scanner(System.in);
    static ArrayList<Universo> universos = new ArrayList();
    static ArrayList<Persona> personas = new ArrayList();
    static ArrayList<Escuadrones> squads = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------------------------------");
        System.out.println("1) Universo");
        System.out.println("2) Personas");
        System.out.println("3) Escuadrones");
        System.out.println("4) Simulacion");
        System.out.println("5) Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = lea.nextInt();
        switch(opcion){
            case 1:{
                crearUniverso();
                break;
            }
            case 2:{
                if(universos.isEmpty()){
                    System.out.println("Debe de Crear un Universo");
                }
                else{
                    
                }
                break;
            }
            case 3:{
                break;
            }
            case 4:{
               break;
            }
            case 5:{
                break;
            }
            case 6:{
                break;
            }
            default:{
                System.out.println("Ingrese una opcion valida");
                break;
            }
        }
    }//fin main
    public static int menuInterno(){
        
    }
    public static void crearUniverso(){
        System.out.print("Ingrese el nombre del Universo: ");
        lea.nextLine();
        String nomUniverso = lea.nextLine();
        universos.add(new Universo(nomUniverso));
    }
    public static void crearPersona(){
        boolean tieneEscuadron = false;
        System.out.print("Ingrese el nombre de la persona: ");
        lea.nextLine();
        String nom = lea.nextLine();
        System.out.print("Ingrese el poder de la persona: ");
        String poder = lea.nextLine();
        System.out.print("Ingrese la Debilidad de la persona: ");
        String debilidad = lea.nextLine();
        System.out.print("Ingrese si es Heroe o Villano: ");
        String bando = lea.nextLine();
        System.out.print("Ingrese la fuerza de la persona: ");
        int fuerza = lea.nextInt();
        System.out.print("Ingrese la habilidad mental de la persona: ");
        int hMental = lea.nextInt();
        System.out.println("Ingrese la habilidad Fisica de la persona");
        int hFisica = lea.nextInt();
        System.out.print("1) Normal");
        System.out.print("2) Mutante");
        System.out.print("3) Por Accidente Radioactivo");
        System.out.print("4) SuperHumano");
        System.out.print("5) ExtraTerrestre");
        System.out.print("Ingrese una opcion: ");
        int x = miniMenuTipos();
        switch(x){
            case 1:{
                personas.add(new Normal(nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                break;
            }
            case 2:{
                personas.add(new Mutante(nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                char cent2;
                do{
                    System.out.println("Ingrese un factor Mutante"); 
                    lea.nextLine();
                    String factor =lea.nextLine();
                    ((Mutante)personas.get(personas.size())).getFactoresMutantes().add(factor);
                    System.out.println("Desea agregar otro factor Mutante [s/n]: ");
                    cent2 = lea.next().charAt(0);
                }while(cent2=='s');
                break;
            }
            case 3:{
                System.out.print("Ingrese la edad al momento que sufrio el Accidente: ");
                int edad = lea.nextInt();
                System.out.print("Ingrese el tipo de accidente que sufrio: ");
                lea.nextLine();
                String tipoAcc = lea.nextLine();
                personas.add(new AccidenteRadioactivo(edad, tipoAcc, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                break;
            }
            case 4:{
                System.out.print("Ingrese el super poder del SuperHumano: ");
                lea.nextLine();
                String superpoder = lea.nextLine();
                personas.add(new SuperHumano(superpoder, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                break;
            }
            case 5:{
                System.out.println("1) Deidad");
                System.out.println("2) Alien");
                System.out.print("Ingrese una opcion: ");
                int op = lea.nextInt();
                switch(op){
                    case 1:{
                        boolean creyentes=false;
                        System.out.print("Tiene creyentes la religion o Mitologia [s/n]: ");
                        char cent3 = lea.next().charAt(0);
                        if(cent3=='s' || cent3=='S'){
                            creyentes=true;
                        }
                        else if(cent3=='n' || cent3=='N'){
                            creyentes=false;
                        }
                        System.out.print("Ingrese el nombre de la religion o Mitologia: ");
                        String nomR = lea.nextLine();
                        personas.add(new Deidad(creyentes, nomR, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                        break;
                    }
                    case 2:{
                        System.out.print("Ingrese el nombre del Planeta");
                        lea.nextLine();
                        String planeta = lea.nextLine();
                        personas.add(new Alien(planeta, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                        break;
                    }
                    default:{
                        System.out.println("Ingrese una opcion valida");
                        break;
                    }
                }
                break;
            }
            default:{
                System.out.println("Ingrese una opcion valida");
                break;
            }
        }
    }
    public static int miniMenuTipos(){
        System.out.print("1) Normal");
        System.out.print("2) Mutante");
        System.out.print("3) Por Accidente Radioactivo");
        System.out.print("4) SuperHumano");
        System.out.print("5) ExtraTerrestre");
        System.out.print("Ingrese una opcion: ");
        int op = lea.nextInt();
        return op;
    }
    
}
