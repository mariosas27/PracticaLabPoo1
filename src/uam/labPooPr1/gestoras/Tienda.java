/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr1.gestoras;
import uam.labPooPr1.base.Venta; 
import java.util.ArrayList; 
/**
 *
 * @author mario
 */
public class Tienda {
    private Catalogo catalogo; 
    private ArrayList<Venta> registroVentas; 

    public Tienda() {
        registroVentas = new ArrayList<>(); 
    }

    public Tienda(Catalogo catalogo) {
        registroVentas = new ArrayList<>(); 
        this.catalogo = catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    
    public void mostrarCatalogo(){
        catalogo.mostrarCatalogo();
        
    }
    
    public void crearVenta(Venta venta){
        registroVentas.add(venta); 
    }
    
    public void  mostrarVentas(){
        System.out.println("Ventas: ");
        for(Venta venta : registroVentas){
            System.out.println(venta.toString());
        }
    }
    
    @Override
    public String toString(){
        return null; 
    }
}
