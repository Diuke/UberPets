
package UberPets;

import java.util.ArrayList;

public class UberPets {
    private int contUber = 0;
    public ArrayList<Client> clientes;
    public ArrayList<Uber> conductores;

    public UberPets() {
        clientes = new ArrayList<Client>();
        conductores = new ArrayList<Uber>();
    }

    public void NuevoUber(String name, int size, String model) {
        conductores.add(new Uber(name, size, model, contUber+1));
        contUber++;
    }

    public void NuevoCliente(int size, String name, String petName) {
        clientes.add(new Client(size, name, petName));
    }

    public boolean validarTarjeta(Tarjeta t) {
        //validacion de la tarjeta con el banco etc
        return true;
    }
    public static void main(String[] args) {
        Form form = new Form();
        form.setVisible(true);
        
    }
    
}
