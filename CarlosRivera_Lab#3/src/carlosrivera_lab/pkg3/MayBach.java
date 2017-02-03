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
public class MayBach extends Carro {

    int llantas_respuesto;

    public MayBach() {
        super();
    }

    public MayBach(int llantas_respuesto, int numero_serie, Date fecha_ensamblaje,
            Color pintura, String marca_llantas, String polarizado,
            double velocidad, double galones, double precio) {
        super(numero_serie, fecha_ensamblaje, pintura, marca_llantas, polarizado,
                velocidad, galones, precio);
        this.llantas_respuesto = llantas_respuesto;
    }

    public int getLlantas_respuesto() {
        return llantas_respuesto;
    }

    public void setLlantas_respuesto(int llantas_respuesto) {
        this.llantas_respuesto = llantas_respuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "MayBach{" + "llantas_respuesto=" + llantas_respuesto + '}';
    }

}
