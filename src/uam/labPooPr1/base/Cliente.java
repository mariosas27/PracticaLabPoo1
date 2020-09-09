/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr1.base;

/**
 *
 * @author mario
 */
public class Cliente {
    private String nombre; 
    private String apellidos; 
    private int edad; 
    private String direccion; 

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, int edad, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nEdad: " + this.edad + "\nDireccion: " + this.direccion; 
    }
}
