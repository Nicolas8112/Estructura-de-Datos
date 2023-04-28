package Turnos;

public class Contacto {
    private String nombre;
    private String telefono;
    private int cedula;
    private int edad;

    public Contacto(String nombre, String telefono, int cedula, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
        this.edad = edad;
    }

    public Contacto(String nombre, String telefono, int cedula) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean equals(Contacto c){

        if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())){
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono + ", cedula=" + cedula + ", edad=" + edad;
    }


}

