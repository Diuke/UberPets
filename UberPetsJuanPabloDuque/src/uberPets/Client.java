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
public class Client {
    Scanner scan = new Scanner(System.in);
    int tamaño;
    String nombre;
    String nombrePet;
    Tarjeta tarjeta;
    String direcciones;
    boolean moving;
    Uber link;

    public Client(int tamaño, String nombre, String nombrePet) {
        this.tamaño = tamaño;
        this.nombre = nombre;
        this.nombrePet = nombrePet;
        direcciones = "";
        this.moving = false;
        this.link = null;
    }
    //getters
    public int getTamaño() {
        return tamaño;
    }
    
    public Uber getLink(){
        return this.link;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombrePet() {
        return nombrePet;
    }
    
    public Tarjeta getTarjeta(){
        return this.tarjeta;
    }
    //setters
    public void setTarjeta(int num, int vencimiento, String name){
        tarjeta = new Tarjeta(num, vencimiento, name);
    }
     
    public void setLink(Uber link) {
        this.link = link;
    }
     
    //custom methods
    public void toggleMoving(){
        this.moving = !this.moving;
    }
    
}
