/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_diegomolina_12141157;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Examen1P2_DiegoMolina_12141157 {
    static Scanner lea = new Scanner(System.in);
    static ArrayList<Universo> universos = new ArrayList();
    static ArrayList<Persona> heroes = new ArrayList();
    static ArrayList<Persona> villanos = new ArrayList();
    static ArrayList<Escuadrones> squads = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        while(opcion!=4){
            System.out.println("------------------------------------------");
            System.out.println("1) Universo");
            System.out.println("2) Personas");
            System.out.println("3) Escuadrones");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = lea.nextInt();
            switch(opcion){
                case 1:{
                    int x = menuInternoUniversos();
                    while(x!=5){
                        switch(x){
                            case 1:{
                                crearUniverso();
                                break;
                            }
                            case 2:{
                                modificarUniverso();
                                break;
                            }
                            case 3:{
                                eliminarUniverso();
                                break;

                            }
                            case 4:{
                                listarUniversos();
                                break;
                            }
                            case 5:{
                                break;
                            }
                            default:{
                                System.out.println("Ingrese una opcion valida");
                                break;
                            }
                        }    
                    }
                    break;
                }
                case 2:{
                    if(universos.isEmpty()){
                        System.out.println("Debe de Crear un Universo");
                    }
                    else{
                        int x = menuInternoEscuadrones();
                        while(x!=7){
                            switch(x){
                                case 1:{
                                    crearEscuadron();
                                    break;
                                }
                                case 2:{
                                    modificarEscuadron();
                                    break;
                                }
                                case 3:{
                                    eliminarEscuadron();
                                    break;
                                }
                                case 4:{
                                    listarEscuadron();
                                    break;
                                }
                                case 5:{
                                    agregarPersonas();
                                    break;
                                }
                                case 6:{
                                    simular();
                                    break;
                                }
                                case 7:{
                                    break;
                                }
                                default:{
                                    System.out.println("Ingrese una opcion valida");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 3:{
                    if(universos.isEmpty()){
                        System.out.println("Debe de Crear un Universo");
                    }
                    else{
                        int x = menuInternoUniversos();
                        while(x!=5){
                            switch(x){
                                case 1:{
                                    crearPersona();
                                    break;
                                }
                                case 2:{
                                    modificarPersona();
                                    break;
                                }
                                case 3:{
                                    eliminarPersona();
                                    break;

                                }
                                case 4:{
                                    listarPersona();
                                    break;
                                }
                                case 5:{
                                    break;
                                }
                                default:{
                                    System.out.println("Ingrese una opcion valida");
                                    break;
                                }
                            }    
                        }
                    }
                    break;
                }
                case 4:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Ingrese una opcion valida");
                    break;
                }
            }
        }
        
    }//fin main
    public static int menuInternoUniversos(){
        System.out.println("--------------------------");
        System.out.println("1) Crear Universo");
        System.out.println("2) Modificar Universo");
        System.out.println("3) Eliminar Universo");
        System.out.println("4) Listar Universos");
        System.out.println("5) Salir");
        System.out.print("Ingrese una opcion: ");
        int op = lea.nextInt();
        System.out.println("--------------------------");
        return op;
    }
    public static int menuInternoEscuadrones(){
        System.out.println("--------------------------");
        System.out.println("1) Crear Escuadron");
        System.out.println("2) Modificar Escuadron");
        System.out.println("3) Eliminar Escuadron");
        System.out.println("4) Listar Escaudrones");
        System.out.println("5) Agregar Personas");
        System.out.println("6) Batallar");
        System.out.println("7) Salir");
        System.out.print("Ingrese una opcion: ");
        int op = lea.nextInt();
        System.out.println("--------------------------");
        return op;
    }
    public static int menuInternoPersonas(){
        System.out.println("--------------------------");
        System.out.println("1) Crear Personas");
        System.out.println("2) Modificar Personas");
        System.out.println("3) Eliminar Persona");
        System.out.println("4) Listar Persona");
        System.out.println("5) Salir");
        System.out.print("Ingrese una opcion: ");
        int op = lea.nextInt();
        System.out.println("--------------------------");
        return op;
    }
    public static void crearUniverso(){
        System.out.print("Ingrese el nombre del Universo: ");
        lea.nextLine();
        String nomUniverso = lea.nextLine();
        universos.add(new Universo(nomUniverso));
    }
    public static void modificarUniverso(){
        System.out.println("Ingrese el numero del Universo a Modificar [0 a "+(universos.size()-1)+"]: ");
        int pos = lea.nextInt();
        System.out.println("Ingrese el nuevo nombre del Universo");
        lea.nextLine();
        String nombre = lea.nextLine();
        universos.get(pos).setNombreUniverso(nombre);
        System.out.println("Se ha modificado exitosamente");
    }
    public static void eliminarUniverso(){
        System.out.println("Ingrese el numero del Universo a Eliminar [0 a "+(universos.size()-1)+"]: ");
        int pos = lea.nextInt();
        universos.remove(pos);
    }
    public static void listarUniversos(){
        for (Universo ob : universos) {
            System.out.println(universos.indexOf(ob)+"-->"+ob.toString());
        }
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
                if(bando.equalsIgnoreCase("Heroe")){
                    heroes.add(new Normal(nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                else if(bando.equalsIgnoreCase("Villano")){
                    villanos.add(new Normal(nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                break;
            }
            case 2:{
                if(bando.equalsIgnoreCase("Heroe")){
                    heroes.add(new Mutante(nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                else if(bando.equalsIgnoreCase("Villano")){
                    villanos.add(new Mutante(nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                char cent2;
                if(bando.equalsIgnoreCase("Heroe")){
                    do{
                        System.out.println("Ingrese un factor Mutante"); 
                        lea.nextLine();
                        String factor =lea.nextLine();
                        ((Mutante)heroes.get(heroes.size())).getFactoresMutantes().add(factor);
                        System.out.println("Desea agregar otro factor Mutante [s/n]: ");
                        cent2 = lea.next().charAt(0);
                    }while(cent2=='s');
                }
                else if(bando.equalsIgnoreCase("Villano")){
                    do{
                        System.out.println("Ingrese un factor Mutante"); 
                        lea.nextLine();
                        String factor =lea.nextLine();
                        ((Mutante)villanos.get(villanos.size())).getFactoresMutantes().add(factor);
                        System.out.println("Desea agregar otro factor Mutante [s/n]: ");
                        cent2 = lea.next().charAt(0);
                    }while(cent2=='s');
                }
                
                break;
            }
            case 3:{
                System.out.print("Ingrese la edad al momento que sufrio el Accidente: ");
                int edad = lea.nextInt();
                System.out.print("Ingrese el tipo de accidente que sufrio: ");
                lea.nextLine();
                String tipoAcc = lea.nextLine();
                if(bando.equalsIgnoreCase("Heroe")){
                    heroes.add(new AccidenteRadioactivo(edad, tipoAcc, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                else if(bando.equalsIgnoreCase("Villano")){
                    villanos.add(new AccidenteRadioactivo(edad, tipoAcc, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                break;
            }
            case 4:{
                System.out.print("Ingrese el super poder del SuperHumano: ");
                lea.nextLine();
                String superpoder = lea.nextLine();
                if(bando.equalsIgnoreCase("Heroe")){
                    heroes.add(new SuperHumano(superpoder, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
                else if(bando.equalsIgnoreCase("Villano")){
                    villanos.add(new SuperHumano(superpoder, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                }
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
                        if(bando.equalsIgnoreCase("Heroe")){
                            heroes.add(new Deidad(creyentes, nomR, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                        }
                        else if(bando.equalsIgnoreCase("Villano")){
                            villanos.add(new Deidad(creyentes, nomR, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                        }
                        
                        break;
                    }
                    case 2:{
                        System.out.print("Ingrese el nombre del Planeta");
                        lea.nextLine();
                        String planeta = lea.nextLine();
                        if(bando.equalsIgnoreCase("Heroe")){
                            heroes.add(new Alien(planeta, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                        }
                        else if(bando.equalsIgnoreCase("Villano")){
                            villanos.add(new Alien(planeta, nom, poder, debilidad, bando, false, fuerza, hFisica, hMental));
                        }
                        
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
    public static void modificarPersona(){
        System.out.println("1) Heroe");
        System.out.println("2) Villano");
        int op = lea.nextInt();
        if(op==1){
            
        }
        else if(op==2){
            
        }
    }
    public static void eliminarPersona(){
        System.out.println("1) Heroe");
        System.out.println("2) Villano");
        int op = lea.nextInt();
        if(op==1){
            System.out.println("Ingrese un numero entre [0 a "+(heroes.size()-1)+"]: ");
            int pos = lea.nextInt();
            heroes.remove(pos);
        }
        else if(op==2){
            System.out.println("Ingrese un numero entre [0 a "+(villanos.size()-1)+"]: ");
            int pos = lea.nextInt();
            villanos.remove(pos);
        }
    }
    public static void listarPersona(){
        System.out.println("1) Heroe");
        System.out.println("2) Villano");
        int op = lea.nextInt();
        if(op==1){
            for (Persona ob : heroes) {
                System.out.println(heroes.indexOf(ob)+"-->"+" Nombre = "+ob.getNombre()+" Poder = "+ob.getPoder());
            }
        }
        else if(op==2){
            for (Persona ob : villanos) {
                System.out.println(villanos.indexOf(ob)+"-->"+" Nombre = "+ob.getNombre()+" Debilidad = "+ob.getDebilidad());
            }
        }
    }
    
}
