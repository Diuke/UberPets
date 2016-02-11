/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberPets;

import java.util.Scanner;

/**
 *
 * @author juan-
 */
public class Uber {
    private String nombre;
    private int tamano;
    private boolean disponible;
    private int numCarro;
    private String Modelo;
    private Client link;

    public Uber(String nombre, int tamano, String Modelo, int numCarro) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.Modelo = Modelo;
        this.numCarro = numCarro;
        disponible = true;
        Client link = null;
    }
    
    //getters 
    public String getNombre() {
        return nombre;
    }
    
    public String getModelo() {
        return Modelo;
    }
        
    public int GetNumCarro(){
        return numCarro;
    }
    public int GetSize(){
        return tamano;
    }
    public boolean getDisponible(){
        return disponible;
    }
    
    public Client getClient(){
        return this.link;
    }
    
    //setters
    public void setClient(Client c){
        this.link = c;
    }
    
    //custom methods
    public void toggleDisponible(){
        disponible = !disponible;
    }
}
