/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg3;

/**
 *
 * @author Usuario Dell
 */
public class Empleados extends Persona {

    int horas_trabajadas;
    Clientes cliente;

    public Empleados() {
        super();
    }

    public Empleados(int horas_trabajadas, Clientes cliente, String nombre, int id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.horas_trabajadas = horas_trabajadas;
        this.cliente = cliente;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleados{" + "horas_trabajadas=" + horas_trabajadas + ", cliente=" + cliente + '}';
    }

}
