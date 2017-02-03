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
public class Morgan_Aero_8 extends Carro {

    String cabina;
    String convertible;

    public Morgan_Aero_8() {
        super();
    }

    public Morgan_Aero_8(String cabina, String convertible, int numero_serie,
            Date fecha_ensamblaje, Color pintura, String marca_llantas,
            String polarizado, double velocidad, double galones, double precio) {
        super(numero_serie, fecha_ensamblaje, pintura, marca_llantas, polarizado,
                velocidad, galones, precio);
        this.cabina = cabina;
        this.convertible = convertible;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return super.toString() + "Morgan_Aero_8{" + "cabina=" + cabina + ", convertible=" + convertible + '}';
    }

}
