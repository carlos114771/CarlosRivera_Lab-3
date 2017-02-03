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
        ArrayList<Ventas> ventas = new ArrayList();
        String menu, submenu, subopcion, salida = null;
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
                    + "3- Eliminar Carro o Persona\n"
                    + "4- Ventas\n"
                    + "5- Reporte\n"
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

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

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

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

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

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

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

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

                        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso "));

                        transmision = Double.parseDouble(JOptionPane.showInputDialog("Transmision "));

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

                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));

                        peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));

                        horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas "));
                        lista.add(new Empleados(horas_trabajadas, new Clientes(), nombre, id, edad, altura, peso_persona));
                        if (subopcion.equalsIgnoreCase("b")) {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));

                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));

                            peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));

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
                        for (Object temporal : lista) {
                            if (temporal instanceof MayBach) {
                                salida += lista.indexOf(temporal) + " " + ((MayBach) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a Modificar"));
                        llantas_respuesto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Llantas de Respuesto "));
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.DARK_GRAY;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

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
                        for (Object temporal : lista) {
                            if (temporal instanceof Morgan_Aero_8) {
                                salida += lista.indexOf(temporal) + " " + ((MayBach) temporal);
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        convertible = JOptionPane.showInputDialog("Es convertible? ");
                        cabina = JOptionPane.showInputDialog("Cabina Simple o Doble? ");
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.BLACK;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

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
                        for (Object temporal : lista) {
                            if (temporal instanceof Fisker_Automotive) {
                                salida += lista.indexOf(temporal) + " " + ((Fisker_Automotive) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        tipo = JOptionPane.showInputDialog("Es Camioneta o Turismo ");
                        convertible = JOptionPane.showInputDialog("Es convetible? ");
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.PINK;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

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
                        for (Object temporal : lista) {
                            if (temporal instanceof Tramontana) {
                                salida += lista.indexOf(temporal) + " " + ((Tramontana) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        numero_serie = Integer.parseInt(JOptionPane.showInputDialog("Numero de Serie "));
                        fecha_ensamblaje = new Date();
                        pintura = Color.YELLOW;
                        marca_llantas = JOptionPane.showInputDialog("Marca de las llantas ");
                        polarizado = JOptionPane.showInputDialog("Tiene Polarizado? ");
                        velocidad = Double.parseDouble(JOptionPane.showInputDialog(" Velocidad Maxima "));

                        galones = Double.parseDouble(JOptionPane.showInputDialog("Galones "));

                        precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de Ventas "));

                        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso "));

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
                        for (Object temporal : lista) {
                            if (temporal instanceof Empleados) {
                                salida += lista.indexOf(temporal) + " " + ((Empleados) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                        nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                        id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));

                        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));

                        peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));

                        horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas "));
                        if (lista.get(posicion) instanceof Empleados) {
                            ((Empleados) lista.get(posicion)).setAltura(altura);
                            ((Empleados) lista.get(posicion)).setCliente(new Clientes());
                            ((Empleados) lista.get(posicion)).setEdad(edad);
                            ((Empleados) lista.get(posicion)).setHoras_trabajadas(horas_trabajadas);
                            ((Empleados) lista.get(posicion)).setId(id);
                            ((Empleados) lista.get(posicion)).setNombre(nombre);
                            ((Empleados) lista.get(posicion)).setPeso(peso_persona);
                        }
                        if (subopcion.equalsIgnoreCase("b")) {
                            for (Object temporal : lista) {
                                if (temporal instanceof Clientes) {
                                    salida += lista.indexOf(temporal) + " " + ((Clientes) temporal) + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a modificar "));
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre ");
                            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id "));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad "));

                            altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura "));

                            peso_persona = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso de la persona "));

                            dinero = Double.parseDouble(JOptionPane.showInputDialog("Dinero que porta "));
                            if (lista.get(posicion) instanceof Clientes) {
                                ((Clientes) lista.get(posicion)).setAltura(altura);
                                ((Clientes) lista.get(posicion)).setDinero(dinero);
                                ((Clientes) lista.get(posicion)).setEdad(edad);
                                ((Clientes) lista.get(posicion)).setId(id);
                                ((Clientes) lista.get(posicion)).setNombre(nombre);
                                ((Clientes) lista.get(posicion)).setPeso(peso_persona);
                            }
                        }
                    }
                }
            }
            if (opcion == 3) {
                submenu = "a- Eliminar Carro\n"
                        + "b- Eliminar Persona\n";
                subopcion = JOptionPane.showInputDialog(submenu);
                if (subopcion.equalsIgnoreCase("a")) {
                    submenu = "a- MayBach\n"
                            + "b- Morgan Aero 8\n"
                            + "c- Fisker Automotive\n"
                            + "d- Tramontana\n";
                    subopcion = JOptionPane.showInputDialog(submenu);
                    if (subopcion.equalsIgnoreCase("a")) {
                        for (Object temporal : lista) {
                            if (temporal instanceof MayBach) {
                                salida += lista.indexOf(temporal) + " " + ((MayBach) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar "));
                        if (lista.get(posicion) instanceof MayBach) {
                            lista.remove(posicion);
                        }
                    }
                    if (subopcion.equalsIgnoreCase("b")) {
                        for (Object temporal : lista) {
                            if (temporal instanceof Morgan_Aero_8) {
                                salida += lista.indexOf(temporal) + " " + ((MayBach) temporal);
                            }
                        }
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar "));
                        if (lista.get(posicion) instanceof Morgan_Aero_8) {
                            lista.remove(posicion);
                        }
                    }
                    if (subopcion.equalsIgnoreCase("c")) {
                        for (Object temporal : lista) {
                            if (temporal instanceof Fisker_Automotive) {
                                salida += lista.indexOf(temporal) + " " + ((Fisker_Automotive) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar "));
                        if (lista.get(posicion) instanceof Fisker_Automotive) {
                            lista.remove(posicion);
                        }
                    }
                    if (subopcion.equalsIgnoreCase("d")) {
                        for (Object temporal : lista) {
                            if (temporal instanceof Tramontana) {
                                salida += lista.indexOf(temporal) + " " + ((Tramontana) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar "));
                        if (lista.get(posicion) instanceof Tramontana) {
                            lista.remove(posicion);
                        }
                    }
                }
                if (subopcion.equalsIgnoreCase("b")) {
                    submenu = "a- Empleados\n"
                            + "b- Clientes\n";
                    subopcion = JOptionPane.showInputDialog(submenu);
                    if (subopcion.equalsIgnoreCase("a")) {
                        for (Object temporal : lista) {
                            if (temporal instanceof Empleados) {
                                salida += lista.indexOf(temporal) + " " + ((Empleados) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar "));
                        if (lista.get(posicion) instanceof Empleados) {
                            lista.remove(posicion);
                        }

                    }
                    if (subopcion.equalsIgnoreCase("b")) {
                        for (Object temporal : lista) {
                            if (temporal instanceof Clientes) {
                                salida += lista.indexOf(temporal) + " " + ((Clientes) temporal) + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, salida);
                        posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion a eliminar "));
                        if (lista.get(posicion) instanceof Clientes) {
                            lista.remove(posicion);
                        }
                    }
                }

            }
            if (opcion == 4) {
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion de las ventas "));
                if (lista.get(posicion) instanceof Clientes) {
                    ((Empleados) lista.get(posicion)).getCliente();
                    ((Clientes) lista.get(posicion)).getLista_carro();
                }

            }
            if (opcion == 5) {
                for (Object temporal : lista) {
                    salida += lista.indexOf(temporal) + " " + temporal + "\n";
                }
            }
        }
    }
}
