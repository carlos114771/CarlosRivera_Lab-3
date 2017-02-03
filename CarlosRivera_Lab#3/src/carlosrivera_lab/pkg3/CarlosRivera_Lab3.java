/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario Dell
 */
public class CarlosRivera_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList();
        String menu, submenu, subopcion;
        int opcion = 0, posicion;
        while (opcion != 6) {
            menu = "1- Agregar Carros o Personas\n"
                    + "2- Modificar Carros o Personas\n"
                    + "3- Listar\n"
                    + "4- Eliminar Carro o Persona\n"
                    + "5- Ventas\n"
                    + "6- Salir\n";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (opcion == 1) {
                submenu = "a- Agregar Carro\n"
                        + "b- Agregar Persona\n";
                subopcion = JOptionPane.showInputDialog(submenu);
                if (subopcion.equalsIgnoreCase("a")) {
                    submenu = "a- MayBach\n"
                            + "b- Morgan Aero 8\n"
                            + "c- Fisker Automrive\n"
                            + "d- Tramontana\n";

                }
                if (subopcion.equalsIgnoreCase("b")) {

                }
            }
            if (opcion == 2) {

            }
            if (opcion == 3) {

            }
            if (opcion == 4) {

            }
            if (opcion == 5) {

            }
        }
    }

}
