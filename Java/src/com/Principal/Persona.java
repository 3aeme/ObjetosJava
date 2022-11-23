package com.Principal;

public class Persona {
    String Nombre, Apellido, ID, CorreoElectronico, Pais;
    int Edad;
    public Persona(){

    }

    public Persona(String nombre, String apellido, String id, String correoElectronico,String pais, int edad) {
        Nombre = nombre;
        Apellido = apellido;
        ID= id;
        CorreoElectronico=correoElectronico;
        Pais=pais;
        Edad=edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        ID = id;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
