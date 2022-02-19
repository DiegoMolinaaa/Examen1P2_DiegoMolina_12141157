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
                                    listarEscuadrones();
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
    public static void crearEscuadron(){
        System.out.print("Ingrese el nombre del Escuadron: ");
        lea.nextLine();
        String nombre = lea.nextLine();
        System.out.print("Ingrese el nombre del lugar base del Escuadron: ");
        String lugar = lea.nextLine();
        boolean sonheroes = false;
        System.out.print("Es escuadron de heroes? [s/n]: ");
        char r = lea.next().charAt(0);
        if(r=='s' || r=='S'){
            sonheroes = true;
        }
        else if(r=='n' || r=='N'){
            sonheroes = false;
        }   
        squads.add(new Escuadrones(nombre, lugar, sonheroes));
        System.out.println("Ingresara el escuadron en un Universo");
        System.out.print("Ingrese un numero entre [0 a"+(universos.size()-1)+"]: ");
        int pos = lea.nextInt();
        universos.get(pos).getSquads().add(squads.get(squads.size()));
        
    }
    public static void modificarEscuadron(){
        System.out.print("Ingrese un numero entre [0 a"+(squads.size()-1)+"]: ");
        int pos = lea.nextInt();
        System.out.print("Ingrese el nuevo nombre del Escuadron: ");
        lea.nextLine();
        String nombre = lea.nextLine();
        ((Escuadrones)squads.get(pos)).setNombre(nombre);
        System.out.print("Ingrese el nombre del lugar base del Escuadron: ");
        String lugar = lea.nextLine();
        ((Escuadrones)squads.get(pos)).setBase(lugar);
        boolean sonheroes = false;
        System.out.print("Es escuadron de heroes? [s/n]: ");
        char r = lea.next().charAt(0);
        if(r=='s' || r=='S'){
            sonheroes = true;
        }
        else if(r=='n' || r=='N'){
            sonheroes = false;
        }
       ((Escuadrones)squads.get(pos)).setTipo(sonheroes);
    }
    public static void eliminarEscuadron(){
        System.out.print("Ingrese un numero entre [0 a"+(squads.size()-1)+"]: ");
        int pos = lea.nextInt();
        squads.remove(pos);
    }
    public static void listarEscuadrones(){
        for (Escuadrones ob : squads) {
            System.out.println(squads.indexOf(ob)+"-->"+ob.toString());
        }
    }
    public static void agregarPersonas(){
        System.out.print("Ingrese la posicion del escuadron a agregar: [0 a "+(squads.size()-1)+"]: ");
        int pos = lea.nextInt();
        char cent1='s';
        char cent2='s';
        if(squads.get(pos).getTipo()==true){
            do{
                System.out.print("Ingrese la posicion de la persona a agregar: [0 a "+(heroes.size()-1)+"]: ");
                int pos1 = lea.nextInt();
                squads.get(pos).getMiembros().add(heroes.get(pos));
                if(squads.get(pos).getLider()==null){
                    System.out.print("Desea que sea el lider del escuadron [s/n]: ");
                    cent2 = lea.next().charAt(0);
                    if(cent2=='s' || cent2=='S'){
                        squads.get(pos).setLider(heroes.get(pos)); 
                    }
                    System.out.print("Desea ingresar otra persona [s/n]: ");
                    cent1 = lea.next().charAt(0);
                }    
            }while(cent1=='s'|| cent1=='S');
        }
        else if(squads.get(pos).getTipo()==false){
            do{
                System.out.print("Ingrese la posicion de la persona a agregar: [0 a "+(villanos.size()-1)+"]: ");
                int pos1 = lea.nextInt();
                squads.get(pos).getMiembros().add(villanos.get(pos));
                if(squads.get(pos).getLider()==null){
                    System.out.print("Desea que sea el lider del escuadron [s/n]: ");
                    cent2 = lea.next().charAt(0);
                    if(cent2=='s' || cent2=='S'){
                        squads.get(pos).setLider(villanos.get(pos)); 
                    }
                    System.out.print("Desea ingresar otra persona [s/n]: ");
                    cent1 = lea.next().charAt(0);
                }     
            }while(cent1=='s'|| cent1=='S');
        }
        System.out.println("Ingresara el escuadron en un Universo");
        System.out.print("Ingrese un numero entre [0 a"+(universos.size()-1)+"]: ");
        int pos4 = lea.nextInt();
        universos.get(pos4).getSquads().add(squads.get(pos));
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
            System.out.println("Ingrese un numero entre [0 a "+(heroes.size()-1)+"]: ");
            int pos = lea.nextInt();
            if(heroes.get(pos) instanceof Normal){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Normal)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Normal)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Normal)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Normal)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Normal)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Normal)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Normal)heroes.get(pos)).setAgFisica(hFisica);
                }
            }
            else if(heroes.get(pos) instanceof Mutante){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Factores Mutantes");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Mutante)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Mutante)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Mutante)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    char cent2='s';
                    for (int i = 0; i < ((Mutante)heroes.get(pos)).getFactoresMutantes().size()-1; i++) {
                        ((Mutante)heroes.get(pos)).getFactoresMutantes().remove(i);
                    }
                    do{
                        System.out.println("Ingrese un factor Mutante"); 
                        lea.nextLine();
                        String factor =lea.nextLine();
                        ((Mutante)heroes.get(heroes.size())).getFactoresMutantes().add(factor);
                        System.out.println("Desea agregar otro factor Mutante [s/n]: ");
                        cent2 = lea.next().charAt(0);
                    }while(cent2=='s');
                }
            }
            else if(heroes.get(pos) instanceof AccidenteRadioactivo){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Edad de Accidente");
                System.out.println("9) Tipo de Accidente");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    System.out.print("Ingrese la nueva edad del Accidente: ");
                    int edadAcc = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setEdadAccidente(edadAcc);
                }
                else if(resp==9){
                    System.out.print("Ingrese lel nuevo tipo de Accidente: ");
                    lea.nextLine();
                    String tipoAcc = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setTipoAccidente(tipoAcc);
                }
            }
            else if(heroes.get(pos) instanceof SuperHumano){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) SuperPoder");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((SuperHumano)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((SuperHumano)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((SuperHumano)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    System.out.print("Ingrese el nuevo superPoder: ");
                    lea.nextLine();
                    String sPoder = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setSuperPoder(sPoder);
                }
            }
            else if(heroes.get(pos) instanceof Deidad){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Creyentes");
                System.out.println("9) Nombre de Religion o Mitologia");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Deidad)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Deidad)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Deidad)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp == 8){
                    boolean creyentes=false;
                    System.out.print("Tiene creyentes [s/n]: ");
                    char r = lea.next().charAt(0);
                    if(r=='s' || r=='S'){
                        creyentes=true;
                    }
                    else if(r=='n' || r=='N'){
                        creyentes=false;
                    }
                    ((Deidad)heroes.get(pos)).setTieneCreyentes(creyentes);
                }
                else if(resp==9){
                    System.out.print("Ingrese el nuevo nombre de la Religion o Mitologia");
                    lea.nextLine();
                    String nomR = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setReligion(nomR);
                }
            }
            else if(heroes.get(pos) instanceof Alien){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Planeta");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Alien)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Alien)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Alien)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Alien)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Alien)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Alien)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Alien)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    System.out.print("Ingrese el nuevo Planeta");
                    lea.nextLine();
                    String planeta = lea.nextLine();
                    ((Alien)heroes.get(pos)).setPlaneta(planeta);
                }
            }
        }
        else if(op==2){
            System.out.println("Ingrese un numero entre [0 a "+(villanos.size()-1)+"]: ");
            int pos = lea.nextInt();
            if(heroes.get(pos) instanceof Normal){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Normal)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Normal)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Normal)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Normal)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Normal)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Normal)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Normal)heroes.get(pos)).setAgFisica(hFisica);
                }
            }
            else if(heroes.get(pos) instanceof Mutante){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Factores Mutantes");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Mutante)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Mutante)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Mutante)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Mutante)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    char cent2='s';
                    for (int i = 0; i < ((Mutante)heroes.get(pos)).getFactoresMutantes().size()-1; i++) {
                        ((Mutante)heroes.get(pos)).getFactoresMutantes().remove(i);
                    }
                    do{
                        System.out.println("Ingrese un factor Mutante"); 
                        lea.nextLine();
                        String factor =lea.nextLine();
                        ((Mutante)heroes.get(heroes.size())).getFactoresMutantes().add(factor);
                        System.out.println("Desea agregar otro factor Mutante [s/n]: ");
                        cent2 = lea.next().charAt(0);
                    }while(cent2=='s');
                }
            }
            else if(heroes.get(pos) instanceof AccidenteRadioactivo){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Edad de Accidente");
                System.out.println("9) Tipo de Accidente");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    System.out.print("Ingrese la nueva edad del Accidente: ");
                    int edadAcc = lea.nextInt();
                    ((AccidenteRadioactivo)heroes.get(pos)).setEdadAccidente(edadAcc);
                }
                else if(resp==9){
                    System.out.print("Ingrese lel nuevo tipo de Accidente: ");
                    lea.nextLine();
                    String tipoAcc = lea.nextLine();
                    ((AccidenteRadioactivo)heroes.get(pos)).setTipoAccidente(tipoAcc);
                }
            }
            else if(heroes.get(pos) instanceof SuperHumano){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) SuperPoder");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((SuperHumano)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((SuperHumano)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((SuperHumano)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    System.out.print("Ingrese el nuevo superPoder: ");
                    lea.nextLine();
                    String sPoder = lea.nextLine();
                    ((SuperHumano)heroes.get(pos)).setSuperPoder(sPoder);
                }
            }
            else if(heroes.get(pos) instanceof Deidad){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Creyentes");
                System.out.println("9) Nombre de Religion o Mitologia");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Deidad)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Deidad)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Deidad)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp == 8){
                    boolean creyentes=false;
                    System.out.print("Tiene creyentes [s/n]: ");
                    char r = lea.next().charAt(0);
                    if(r=='s' || r=='S'){
                        creyentes=true;
                    }
                    else if(r=='n' || r=='N'){
                        creyentes=false;
                    }
                    ((Deidad)heroes.get(pos)).setTieneCreyentes(creyentes);
                }
                else if(resp==9){
                    System.out.print("Ingrese el nuevo nombre de la Religion o Mitologia");
                    lea.nextLine();
                    String nomR = lea.nextLine();
                    ((Deidad)heroes.get(pos)).setReligion(nomR);
                }
            }
            else if(heroes.get(pos) instanceof Alien){
                System.out.println("1) Nombre");
                System.out.println("2) Poder");
                System.out.println("3) Debilidad");
                System.out.println("4) Heroe o Villano");
                System.out.println("5) Fuerza");
                System.out.println("6) Habilidad Mental");
                System.out.println("7) Habilidad Fisica");
                System.out.println("8) Planeta");
                System.out.print("Ingrese una opcion: ");
                int resp= lea.nextInt();
                if(resp==1){
                    System.out.print("Ingrese el nuevo Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    ((Alien)heroes.get(pos)).setNombre(nombre);
                }
                else if(resp==2){
                    System.out.print("Ingrese el nuevo Poder: ");
                    lea.nextLine();
                    String poder = lea.nextLine();
                    ((Alien)heroes.get(pos)).setPoder(poder);
                }
                else if(resp==3){
                    System.out.print("Ingrese la nueva Debilidad: ");
                    lea.nextLine();
                    String debilidad = lea.nextLine();
                    ((Alien)heroes.get(pos)).setDebilidad(debilidad);
                }
                else if(resp==4){
                    System.out.print("Ingrese el nuevo bando [Heroe/Villano]: ");
                    lea.nextLine();
                    String bando = lea.nextLine();
                    ((Alien)heroes.get(pos)).setHeroeOVillano(bando);
                }
                else if(resp==5){
                    System.out.print("Ingrese la nueva fuerza: ");
                    int fuerza = lea.nextInt();
                    ((Alien)heroes.get(pos)).setFuerza(fuerza);
                }
                else if(resp==6){
                    System.out.print("Ingrese la nueva habilidad mental: ");
                    int hMental = lea.nextInt();
                    ((Alien)heroes.get(pos)).setAgMental(hMental);
                }
                else if(resp==7){
                    System.out.print("Ingrese la nueva habilidad fisica: ");
                    int hFisica = lea.nextInt();
                    ((Alien)heroes.get(pos)).setAgFisica(hFisica);
                }
                else if(resp==8){
                    System.out.print("Ingrese el nuevo Planeta");
                    lea.nextLine();
                    String planeta = lea.nextLine();
                    ((Alien)heroes.get(pos)).setPlaneta(planeta);
                }
            }
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
            System.out.println("Se ha eliminado exitosamente");
        }
        else if(op==2){
            System.out.println("Ingrese un numero entre [0 a "+(villanos.size()-1)+"]: ");
            int pos = lea.nextInt();
            villanos.remove(pos);
            System.out.println("Se ha eliminado exitosamente");
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
