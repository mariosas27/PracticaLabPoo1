/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr1.base;
import java.util.Date;
import uam.labPooPr1.abstractas.Dispositivo; 


/**
 *
 * @author mario
 */
public class Wearable extends Dispositivo{
    private String numeroSerie; 
    private String tipoInterfazCarga; 
    private String tipoMaterial; 
    private Date horaFecha; 
    
    
    public Wearable() {
    }

    public Wearable(String marca, String modelo, Double precio, String descripcion, String color,String numeroSerie, String tipoInterfazCarga, String tipoMaterial) {
        this.marca = marca; 
        this.modelo = modelo; 
        this.precio = precio; 
        this.descripcion = descripcion; 
        this.color = color; 
        this.numeroSerie = numeroSerie;
        this.tipoInterfazCarga = tipoInterfazCarga;
        this.tipoMaterial = tipoMaterial;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setTipoInterfazCarga(String tipoInterfazCarga) {
        this.tipoInterfazCarga = tipoInterfazCarga;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getTipoInterfazCarga() {
        return tipoInterfazCarga;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public Date getHoraFecha() {
        return horaFecha;
    }
    
    @Override
    public String toString(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nPrecio: " + this.precio
                + "\nDescripcion: " + this.descripcion + "\nColor: " + this.color + "\nNumero de serie: " + this.numeroSerie
                + "\nTipo de material " + this.tipoMaterial + "\nTipo de interfaz de carga: " + this.tipoInterfazCarga; 
    }
    
}
