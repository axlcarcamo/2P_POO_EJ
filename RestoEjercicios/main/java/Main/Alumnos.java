/*
Univerisidad Tecnologica de Honduras
Catedratico     : Ing. Walter Suazo.
Clase           : Programacion Orientada a Objetos.
Alumno          : Axel Raul Carcamo G.
Numero de cuenta: 201910060114

 */

package Main;

/*
@author axelcarcamo
*/


package com.company;

public class Alumnos {
    private String Nombre;
    private int edad;
    private double estatura;
    private String cuenta;
    private String telefono;

    public Alumnos(String cuenta) {
        this.cuenta = cuenta;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
