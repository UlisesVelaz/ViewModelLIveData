package com.androiddesdecero.viewmodellivedata;
/**
 * Created by ulisesvelázquez on 11/oct/22
 */
public class User {
    private String nombre;
    private String edad;

    public User() {

    }

    public User(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
