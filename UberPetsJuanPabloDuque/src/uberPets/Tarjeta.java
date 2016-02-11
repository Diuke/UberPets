/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberPets;

/**
 *
 * @author juan-
 */
public class Tarjeta {
    int numero;
    int anoVencimiento;
    String nombreTitular;

    public Tarjeta(int numero, int anoVencimiento, String nombreTitular) {
        this.numero = numero;
        this.anoVencimiento = anoVencimiento;
        this.nombreTitular = nombreTitular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAnoVencimiento() {
        return anoVencimiento;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }
    
    
}
