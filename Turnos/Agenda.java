package Turnos;

public class Agenda {

    //Atributos
    private Contacto[] contactos;
    private int Condiciones = 1 ;

    int Edad = 1;

    //Constructores
    public Agenda() {
        this.contactos = new Contacto[10]; //por defecto
    }

    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio]; //tamaño que nosotros queramos
    }

    //Metodos
    public void anadirContacto(Contacto c) {

        if (existeContacto(c)) { //Indico si existe el contacto
            System.out.println("El contacto con ese nombre ya existe");
        } else {

            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) { //controlo los nulos
                    contactos[i] = c; //Inserto el contacto
                    encontrado = true; //Indico que lo he encontrado
                }
            }

            if (encontrado) {
                System.out.println("Paciente almacenado con exito");

                System.out.println(" Su turno es  " +  Condiciones );
            } else {
                System.out.println("No se ha podido añadir");
            }
        }

    }

    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            //Controlo nulos e indico si el contacto es el mismo
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;

    }

    public void listarContactos() {

        if (huecosLibre() == contactos.length) {
            System.out.println("No hay pacientes con turnos");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) { //Controlo nulos
                    System.out.println(contactos[i]);
                }
            }
        }
    }
    public int huecosLibre() {

        int contadorLibres = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) { //Controlo nulos
                contadorLibres++; //Acumulo
            }
        }

        return contadorLibres;

    }

    public int getEdad() {
        return Edad;
    }
}

