/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr1.gestoras;
import uam.labPooPr1.abstractas.Dispositivo; 
import java.util.ArrayList; 
/**
 *
 * @author mario
 */
public class Catalogo {
    private ArrayList<Dispositivo> productos; 
   

    public Catalogo() {
        this.productos = new ArrayList<>(); 
    }

    public Catalogo(ArrayList<Dispositivo> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Dispositivo producto){
        this.productos.add(producto);
    }
    
    public void mostrarCatalogo(){
        System.out.println("A continuación se muestran los productos: ");
        for(Dispositivo disp : productos){
            System.out.println("------------------------------------------");
            System.out.println(disp.toString());
        }
    }
    
    
   @Override
   public String toString(){
      return "El catalogo cuenta con " + this.productos.size() + " productos"; 
   }
    
    
}
