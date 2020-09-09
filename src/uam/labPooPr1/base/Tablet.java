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
public class Tablet extends Dispositivo {
    private String numeroSerie; 
    private String tipoInterfazCarga; 
    private String compania; 

    public Tablet() {
    }

    public Tablet(String marca, String modelo, Double precio, String descripcion, String color, String numeroSerie, String tipoInterfazCarga, String compania) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
        this.descripcion = descripcion; 
        this.color = color; 
        this.numeroSerie = numeroSerie;
        this.tipoInterfazCarga = tipoInterfazCarga;
        this.compania = compania;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setTipoInterfazCarga(String tipoInterfazCarga) {
        this.tipoInterfazCarga = tipoInterfazCarga;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getTipoInterfazCarga() {
        return tipoInterfazCarga;
    }

    public String getCompania() {
        return compania;
    }
    
    
    @Override 
    public String toString(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio
                + "\nDescripcion: " + this.descripcion + "\nColor: " + this.color + "\nNumero de serie: " + this.numeroSerie
                + "\nCompania: " + this.compania + "\nTipo de interfaz de carga: " + this.tipoInterfazCarga; 
    }
    
    
}
