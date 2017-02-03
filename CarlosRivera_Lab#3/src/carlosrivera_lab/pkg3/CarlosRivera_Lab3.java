/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
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
        int numero_serie, llantas_respuesto;
        Date fecha_ensamblaje;
        Color pintura;
        String marca_llantas, polarizado, convertible, cabina, tipo;
        double velocidad, galones, precio, peso, transmision;
        int opcion = 0, posicion;
        String nombre;
        int id;
        int edad;
        int horas_trabajadas;
        double dinero;
        double altura;
        double peso_persona;
        while (opcion != 6) {
            menu = "1- Agregar Carros o Personas\n"
                    + "2- Modificar Carros o Personas\n"
                    + "3- Listar\n"
                    + "4- Eliminar Carro o Persona\n"
                    + "5- Ventas\n"
                    + "6- Salir\n";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            //Agregar
            if (opcion == 1) {
                submenu = "a- Agregar Carro\n"
                        + "b- Agregar Persona\n";
                subopcion = JOptionPane.showInputDialog(submenu);
                if (subopcion.equalsIgnoreCase("a")) {
                    submenu = "a- MayBach\n"
                            + "b- Morgan Aero 8\n"
                            + "c- Fisker Automrive\n"
                            + "d- Tramontana\n";
                    subopcion = JOptionPane.showInputDialog(submenu);
                    if (subopcion.equalsIgnoreCase("a")) {
                        llantas_respuesto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Llantas de Respuesto "));
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.DARK_GRAY;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 155 || velocidad <= 160) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 155 y 160 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 50 || galones <= 55) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 50 y 55 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 400000 || precio <= 600000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 400,000 y 600,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        lista.add(new MayBach(llantas_respuesto, numero_serie,
                                fecha_ensamblaje, pintura, marca_llantas, polarizado,
                                velocidad, galones, precio));
                    }
                    if (subopcion.equalsIgnoreCase("b")) {
                        convertible = JOptionPane.showInputDialog("Es convertible? ");
                        cabina = JOptionPane.showInputDialog("Cabina Simple o Doble? ");
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.BLACK;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 140 || velocidad <= 145) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 140 y 145 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 35 || galones <= 40) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 35 y 40 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 500000 || precio <= 700000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 500,000 y 700,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        lista.add(new Morgan_Aero_8(cabina, convertible,
                                numero_serie, fecha_ensamblaje, pintura,
                                marca_llantas, polarizado, velocidad, galones, precio));

                    }
                    if (subopcion.equalsIgnoreCase("c")) {
                        tipo = JOptionPane.showInputDialog("Es Camioneta o Turismo ");
                        convertible = JOptionPane.showInputDialog("Es convetible? ");
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.PINK;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 160 || velocidad <= 165) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 160 y 165 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 55 || galones <= 60) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 55 y 60 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 450000 || precio <= 650000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 450,000 y 650,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        lista.add(new Fisker_Automotive(tipo, convertible,
                                numero_serie, fecha_ensamblaje, pintura,
                                marca_llantas, polarizado, velocidad, galones, precio));
                    }
                    if (subopcion.equalsIgnoreCase("d")) {
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.YELLOW;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 175 || velocidad <= 180) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 175 y 180 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 50 || galones <= 55) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 50 y 55 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 800000 || precio <= 1000000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 800,000 y 1,000,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso "));
                        while (peso >= 1276 || peso <= 1376) {
                            JOptionPane.showMessageDialog(null, "El peso tiene que estar entre 1276 y 1376");
                            peso = Double.parseDouble(JOptionPane.showInputDialog("Peso "));
                        }
                        transmision = Double.parseDouble(JOptionPane.showInputDialog("Transmision "));
                        while (transmision >= 6 || transmision <= 7) {
                            JOptionPane.showMessageDialog(null, "La transimision tiene que ser 6 o 7");
                            transmision = Double.parseDouble(JOptionPane.showInputDialog("Transmision "));

                        }
                        lista.add(new Tramontana(peso, transmision, numero_serie,
                                fecha_ensamblaje, pintura, marca_llantas, polarizado,
                                velocidad, galones, precio));
                    }
                }
                if (subopcion.equalsIgnoreCase("b")) {
                    submenu = "a- Empleado\n"
                            + "b- Cliente\n";
                    subopcion = JOptionPane.showInputDialog(submenu);
                    if (subopcion.equalsIgnoreCase("a")) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                        while (edad <= 18) {
                            JOptionPane.showMessageDialog(null, "La edad tiene que ser mayor a 18");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                        }
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                        while (altura <= 1.55) {
                            JOptionPane.showMessageDialog(null, "La altura tiene que ser mayor a 1.55 ");
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                        }
                        peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                        while (peso_persona <= 120) {
                            JOptionPane.showMessageDialog(null, "El peso tiene que ser mayor a 120 ");
                            peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                        }
                        horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas "));
                        lista.add(new Empleados(horas_trabajadas, new Clientes(), nombre, id, edad, altura, peso_persona));
                        if (subopcion.equalsIgnoreCase("b")) {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                            while (edad <= 18) {
                                JOptionPane.showMessageDialog(null, "La edad tiene que ser mayor a 18");
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                            }
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                            while (altura <= 1.55) {
                                JOptionPane.showMessageDialog(null, "La altura tiene que ser mayor a 1.55 ");
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                            }
                            peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                            while (peso_persona <= 120) {
                                JOptionPane.showMessageDialog(null, "El peso tiene que ser mayor a 120 ");
                                peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                            }
                            dinero = Double.parseDouble(JOptionPane.showInputDialog("Dinero que porta "));
                            lista.add(new Clientes(dinero, nombre, id, edad, altura, peso_persona));
                        }
                    }
                }
            }
            //Modificar
            if (opcion == 2) {
                submenu = "a- Modificar Carros\n"
                        + "b- Modificar Persona\n";
                subopcion = JOptionPane.showInputDialog(submenu);
                if (subopcion.equalsIgnoreCase("a")) {
                    submenu = "a- MayBach\n"
                            + "b- Morgan Aero 8\n"
                            + "c- Fisker Automrive\n"
                            + "d- Tramontana\n";
                    subopcion = JOptionPane.showInputDialog(submenu);
                    if (subopcion.equalsIgnoreCase("a")) {
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a Modificar"));
                        llantas_respuesto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Llantas de Respuesto "));
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.DARK_GRAY;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 155 || velocidad <= 160) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 155 y 160 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 50 || galones <= 55) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 50 y 55 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 400000 || precio <= 600000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 400,000 y 600,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        if (lista.get(posicion) instanceof MayBach) {
                            ((MayBach) lista.get(posicion)).setFecha_ensamblaje(fecha_ensamblaje);
                            ((MayBach) lista.get(posicion)).setGalones(galones);
                            ((MayBach) lista.get(posicion)).setLlantas_respuesto(llantas_respuesto);
                            ((MayBach) lista.get(posicion)).setMarca_llantas(marca_llantas);
                            ((MayBach) lista.get(posicion)).setNumero_serie(numero_serie);
                            ((MayBach) lista.get(posicion)).setPintura(pintura);
                            ((MayBach) lista.get(posicion)).setPolarizado(polarizado);
                            ((MayBach) lista.get(posicion)).setPrecio(precio);
                            ((MayBach) lista.get(posicion)).setVelocidad(velocidad);
                        }
                    }
                    if (subopcion.equalsIgnoreCase("b")) {
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        convertible = JOptionPane.showInputDialog("Es convertible? ");
                        cabina = JOptionPane.showInputDialog("Cabina Simple o Doble? ");
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.BLACK;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 140 || velocidad <= 145) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 140 y 145 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 35 || galones <= 40) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 35 y 40 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 500000 || precio <= 700000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 500,000 y 700,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        if (lista.get(posicion) instanceof Morgan_Aero_8) {
                            ((Morgan_Aero_8) lista.get(posicion)).setCabina(cabina);
                            ((Morgan_Aero_8) lista.get(posicion)).setConvertible(convertible);
                            ((Morgan_Aero_8) lista.get(posicion)).setFecha_ensamblaje(fecha_ensamblaje);
                            ((Morgan_Aero_8) lista.get(posicion)).setGalones(galones);
                            ((Morgan_Aero_8) lista.get(posicion)).setMarca_llantas(marca_llantas);
                            ((Morgan_Aero_8) lista.get(posicion)).setNumero_serie(numero_serie);
                            ((Morgan_Aero_8) lista.get(posicion)).setPintura(pintura);
                            ((Morgan_Aero_8) lista.get(posicion)).setPolarizado(polarizado);
                            ((Morgan_Aero_8) lista.get(posicion)).setPrecio(precio);
                            ((Morgan_Aero_8) lista.get(posicion)).setVelocidad(velocidad);
                        }

                    }
                    if (subopcion.equalsIgnoreCase("c")) {
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        tipo = JOptionPane.showInputDialog("Es Camioneta o Turismo ");
                        convertible = JOptionPane.showInputDialog("Es convetible? ");
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.PINK;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 160 || velocidad <= 165) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 160 y 165 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 55 || galones <= 60) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 55 y 60 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 450000 || precio <= 650000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 450,000 y 650,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        if (lista.get(posicion) instanceof Fisker_Automotive) {
                            ((Fisker_Automotive) lista.get(posicion)).setConvertible(convertible);
                            ((Fisker_Automotive) lista.get(posicion)).setFecha_ensamblaje(fecha_ensamblaje);
                            ((Fisker_Automotive) lista.get(posicion)).setGalones(galones);
                            ((Fisker_Automotive) lista.get(posicion)).setMarca_llantas(marca_llantas);
                            ((Fisker_Automotive) lista.get(posicion)).setNumero_serie(numero_serie);
                            ((Fisker_Automotive) lista.get(posicion)).setPintura(pintura);
                            ((Fisker_Automotive) lista.get(posicion)).setPolarizado(polarizado);
                            ((Fisker_Automotive) lista.get(posicion)).setPrecio(precio);
                            ((Fisker_Automotive) lista.get(posicion)).setTipo(tipo);
                            ((Fisker_Automotive) lista.get(posicion)).setVelocidad(velocidad);
                        }
                    }
                    if (subopcion.equalsIgnoreCase("d")) {
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.YELLOW;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));
                        while (velocidad >= 175 || velocidad <= 180) {
                            JOptionPane.showMessageDialog(null, "La velocidad tiene que estar entre 175 y 180 km");
                            velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad Maxima "));
                        }
                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        while (galones >= 50 || galones <= 55) {
                            JOptionPane.showMessageDialog(null, "Los galones tienen que estar entre 50 y 55 ");
                            galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));
                        }
                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        while (precio >= 800000 || precio <= 1000000) {
                            JOptionPane.showMessageDialog(null, "El precio de venta tiene que estar entre 800,000 y 1,000,000");
                            precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));
                        }
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso "));
                        while (peso >= 1276 || peso <= 1376) {
                            JOptionPane.showMessageDialog(null, "El peso tiene que estar entre 1276 y 1376");
                            peso = Double.parseDouble(JOptionPane.showInputDialog("Peso "));
                        }
                        transmision = Double.parseDouble(JOptionPane.showInputDialog("Transmision "));
                        while (transmision >= 6 || transmision <= 7) {
                            JOptionPane.showMessageDialog(null, "La transimision tiene que ser 6 o 7");
                            transmision = Double.parseDouble(JOptionPane.showInputDialog("Transmision "));
                        }
                        if (lista.get(posicion) instanceof Tramontana) {
                            ((Tramontana) lista.get(posicion)).setFecha_ensamblaje(fecha_ensamblaje);
                            ((Tramontana) lista.get(posicion)).setGalones(galones);
                            ((Tramontana) lista.get(posicion)).setMarca_llantas(marca_llantas);
                            ((Tramontana) lista.get(posicion)).setNumero_serie(numero_serie);
                            ((Tramontana) lista.get(posicion)).setPeso(peso);
                            ((Tramontana) lista.get(posicion)).setPintura(pintura);
                            ((Tramontana) lista.get(posicion)).setPolarizado(polarizado);
                            ((Tramontana) lista.get(posicion)).setPrecio(precio);
                            ((Tramontana) lista.get(posicion)).setTranmision(transmision);
                            ((Tramontana) lista.get(posicion)).setVelocidad(velocidad);
                        }

                    }
                }
                if (subopcion.equalsIgnoreCase("b")) {
                    submenu = "a- Empleado\n"
                            + "b- Cliente\n";
                    subopcion = JOptionPane.showInputDialog(submenu);
                    if (subopcion.equalsIgnoreCase("a")) {
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                        while (edad <= 18) {
                            JOptionPane.showMessageDialog(null, "La edad tiene que ser mayor a 18");
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                        }
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                        while (altura <= 1.55) {
                            JOptionPane.showMessageDialog(null, "La altura tiene que ser mayor a 1.55 ");
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                        }
                        peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                        while (peso_persona <= 120) {
                            JOptionPane.showMessageDialog(null, "El peso tiene que ser mayor a 120 ");
                            peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                        }
                        horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas "));
                        lista.add(new Empleados(horas_trabajadas, new Clientes(), nombre, id, edad, altura, peso_persona));
                        if (subopcion.equalsIgnoreCase("b")) {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                            while (edad <= 18) {
                                JOptionPane.showMessageDialog(null, "La edad tiene que ser mayor a 18");
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));
                            }
                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                            while (altura <= 1.55) {
                                JOptionPane.showMessageDialog(null, "La altura tiene que ser mayor a 1.55 ");
                                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));
                            }
                            peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                            while (peso_persona <= 120) {
                                JOptionPane.showMessageDialog(null, "El peso tiene que ser mayor a 120 ");
                                peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));
                            }
                            dinero = Double.parseDouble(JOptionPane.showInputDialog("Dinero que porta "));
                            lista.add(new Clientes(dinero, nombre, id, edad, altura, peso_persona));
                        }
                    }
                }
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
