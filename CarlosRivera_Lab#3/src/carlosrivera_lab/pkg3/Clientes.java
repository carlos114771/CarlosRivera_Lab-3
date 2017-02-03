/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg3;

import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class Clientes extends Persona {

    double dinero;
    ArrayList<Carro> lista_carro = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(double dinero, String nombre, int id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Carro> getLista_carro() {
        return lista_carro;
    }

    public void setLista_carro(ArrayList<Carro> lista_carro) {
        this.lista_carro = lista_carro;
    }

   

    @Override
    public String toString() {
        return super.toString() + "Clientes{" + "dinero=" + dinero + ", carro=" + lista_carro + '}';
    }

}
