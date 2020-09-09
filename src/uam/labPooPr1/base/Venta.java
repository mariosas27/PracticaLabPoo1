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
public class Venta {
    private Cliente cliente; 
    private Dispositivo dispositivo; 
    private int cantidad; 
    private Double total; 
    private Date fecha; 

    public Venta() {
    }

    public Venta(Cliente cliente, Dispositivo dispositivo, int cantidad) {
        this.cliente = cliente;
        this.dispositivo = dispositivo;
        this.cantidad = cantidad;
       
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

   

   
    public Cliente getCliente() {
        return cliente;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    public Venta generarVenta(){
        fecha = new Date(); 
        total = cantidad * dispositivo.getPrecio(); 
        return this; 
    }
    
    @Override
    public String toString(){
        return "\nFecha: " + this.fecha + "\nNombre del cliente: " + this.cliente.getNombre() + " " + this.cliente.getApellidos()
                + "\nDispositivo: " + this.dispositivo.toString() + "\nCantidad: " + this.cantidad + 
                "\nTotal: " + this.total; 
    }
    
    
    
}
