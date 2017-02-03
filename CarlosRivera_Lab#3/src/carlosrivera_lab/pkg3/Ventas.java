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
public class Ventas {

    Clientes cliente;
    Empleados empleado;
    Carro carro;

    public Ventas() {
    }

    public Ventas(Clientes cliente, Empleados empleado, Carro carro) {
        this.cliente = cliente;
        this.empleado = empleado;
        this.carro = carro;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Empleados getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleados empleado) {
        this.empleado = empleado;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Ventas{" + "cliente=" + cliente + ", empleado=" + empleado + ", carro=" + carro + '}';
    }
    
}
