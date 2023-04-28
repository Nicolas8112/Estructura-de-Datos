package Turnos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Turnos {

    public static void main(String[] args) {

            Scanner sn = new Scanner(System.in);
            sn.useDelimiter("\n");
            boolean salir = false;
            int opcion; //Guardaremos la opcion del usuario

            Agenda agendaTelefonica = new Agenda(3);
            String nombre ="";

            String telefono;
            int cedula;
            int edad;
            String condicionespe;

            Contacto c;

            while (!salir) {

                System.out.println("1. Solicitar turno");
                System.out.println("2. Asgnacion de turnos");
                System.out.println("3. Salir");
                try {
                    System.out.println("Escribe una de las opciones");
                    opcion = sn.nextInt();

                    switch (opcion) {
                        case 1:

                            //Pido valores
                            System.out.println("Escribe tu nombre");
                            nombre = sn.next();

                            System.out.println("Escribe un telefono");
                            telefono = String.valueOf(sn.nextInt());

                            System.out.println("escribe tu cedula");
                            cedula = sn.nextInt();

                            System.out.println("escribe tu edad");
                            edad = sn.nextInt();

                            //Creo el contacto
                            c = new Contacto(nombre,   telefono, cedula, edad);

                            agendaTelefonica.anadirContacto(c);

                            break;
                        case 2:

                            agendaTelefonica.listarContactos();

                            break;

                        case 3:
                            salir = true;
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 3");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }

            }

        }

    }

