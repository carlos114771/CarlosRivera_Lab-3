/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Usuario Dell
 */
public class Carro {

    int numero_serie;
    Date fecha_ensamblaje;
    Color pintura;
    String marca_llantas;
    String polarizado;
    double velocidad;
    double galones;
    double precio;

    public Carro() {
    }

    public Carro(int numero_serie, Date fecha_ensamblaje, Color pintura, String marca_llantas,
            String polarizado, double velocidad, double galones, double precio) {
        this.numero_serie = numero_serie;
        this.fecha_ensamblaje = fecha_ensamblaje;
        this.pintura = pintura;
        this.marca_llantas = marca_llantas;
        this.polarizado = polarizado;
        this.velocidad = velocidad;
        this.galones = galones;
        this.precio = precio;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public Date getFecha_ensamblaje() {
        return fecha_ensamblaje;
    }

    public void setFecha_ensamblaje(Date fecha_ensamblaje) {
        this.fecha_ensamblaje = fecha_ensamblaje;
    }

    public Color getPintura() {
        return pintura;
    }

    public void setPintura(Color pintura) {
        this.pintura = pintura;
    }

    public String getMarca_llantas() {
        return marca_llantas;
    }

    public void setMarca_llantas(String marca_llantas) {
        this.marca_llantas = marca_llantas;
    }

    public String getPolarizado() {
        return polarizado;
    }

    public void setPolarizado(String polarizado) {
        this.polarizado = polarizado;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getGalones() {
        return galones;
    }

    public void setGalones(double galones) {
        this.galones = galones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "numero_serie=" + numero_serie + ", "
                + "fecha_ensamblaje=" + fecha_ensamblaje + ", "
                + "pintura=" + pintura + ", marca_llantas=" + marca_llantas + ", "
                + "polarizado=" + polarizado + ", velocidad=" + velocidad + ", "
                + "galones=" + galones + ", precio=" + precio + '}';
    }

}
