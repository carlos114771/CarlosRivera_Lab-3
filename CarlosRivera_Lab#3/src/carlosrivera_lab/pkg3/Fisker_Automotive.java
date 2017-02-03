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
public class Fisker_Automotive extends Carro {

    String tipo;
    String convertible;

    public Fisker_Automotive() {
        super();
    }

    public Fisker_Automotive(String tipo, String convertible, int numero_serie,
            Date fecha_ensamblaje, Color pintura, String marca_llantas, String polarizado,
            double velocidad, double galones, double precio) {
        super(numero_serie, fecha_ensamblaje, pintura, marca_llantas, polarizado,
                velocidad, galones, precio);
        this.tipo = tipo;
        this.convertible = convertible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return super.toString() + "Fisker_Automotive{" + "tipo=" + tipo + ", convertible=" + convertible + '}';
    }

}
