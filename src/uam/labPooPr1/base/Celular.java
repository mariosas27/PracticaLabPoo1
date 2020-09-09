/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr1.base;
import uam.labPooPr1.abstractas.Dispositivo; 

/**
 *
 * @author mario
 */
public class Celular extends Dispositivo{
    private String numeroImei; 
    private String compania; 

    public Celular() {
    }

    public Celular(String marca, String modelo, Double precio, String descripcion, String color, String numeroImei, String compania) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
        this.descripcion = descripcion; 
        this.color = color; 
        this.numeroImei = numeroImei;
        this.compania = compania;
    }

    public void setNumeroImei(String numeroImei) {
        this.numeroImei = numeroImei;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNumeroImei() {
        return numeroImei;
    }

    public String getCompania() {
        return compania;
    }
    
    public void llamar(String numero){
        System.out.println("LLamando al numero " + numero);
    }
    
    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Mandando mensaje a " + numero); 
        System.out.println("Contenido del mensaje: " + mensaje);
    }
    @Override
    public String toString(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio
                + "\nDescripcion: " + this.descripcion + "\nColor: " + this.color + "\nNumero Imei: " + this.numeroImei
                + "\nCompania: " + this.compania;  
    }
    
}
