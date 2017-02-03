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
public class Tramontana extends Carro {

    double peso;
    double tranmision;

    public Tramontana() {
        super();
    }

    public Tramontana(double peso, double transmision, int numero_serie, Date fecha_ensamblaje, Color pintura, String marca_llantas, String polarizado, double velocidad, double galones, double precio) {
        super(numero_serie, fecha_ensamblaje, pintura, marca_llantas, polarizado, velocidad, galones, precio);
        if (peso >= 1276 || peso <= 1376) {
            this.peso = peso;
        }
        if (tranmision >= 6 || tranmision <= 7) {

            this.tranmision = tranmision;
        }
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 1276 || peso <= 1376) {

            this.peso = peso;
        }
    }

    public double getTranmision() {
        return tranmision;
    }

    public void setTranmision(double tranmision) {
        if (tranmision >= 6 || tranmision <= 7) {

            this.tranmision = tranmision;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Tramontana{" + "peso=" + peso + '}';
    }

}
