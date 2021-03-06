package org.uma.mbd.mdHospitalV1L.mdhospitalv1l;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private Genero sexo;

    public Persona(String nombre, String apellidos, String dni, int edad, Genero sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public Genero getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos + "; " + edad + "; " + sexo + "; " + dni;
    }

}
