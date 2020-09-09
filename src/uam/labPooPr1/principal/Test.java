/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.labPooPr1.principal;

import java.util.ArrayList;
import uam.labPooPr1.abstractas.Dispositivo;
import uam.labPooPr1.base.Celular;
import uam.labPooPr1.base.Cliente;
import uam.labPooPr1.base.Tablet;
import uam.labPooPr1.base.Venta;
import uam.labPooPr1.base.Wearable;
import uam.labPooPr1.gestoras.Catalogo;
import uam.labPooPr1.gestoras.Tienda;
/**
 *
 * @author mario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Genermaos un celular con el primer constructor
        Celular celular1 = new Celular(); 
        celular1.setMarca("Huawei");
        celular1.setModelo("P30");
        celular1.setPrecio(12000.0);
        celular1.setDescripcion("Celular huawei con 4gb de ram y 128 gb de almacenamiento interno");
        celular1.setColor("Negro");
        celular1.setNumeroImei("2111920da23");
        celular1.setCompania("AT&T");
        
        // Generamos un celular con el segundo constructor 
        Celular celular2 = new Celular("Apple", "IPhone 11", 18000.0, "IPhone 11 de 3gb de ram con 128 gb de almacenamiento interno ", "Blanco", "21l2a920da23", "Telcel"); 
        
//        System.out.println(celular2.toString());
        
        
        // Generamos una tablet con el primer constructor 
        Tablet tablet1 = new Tablet(); 
        tablet1.setMarca("Apple");
        tablet1.setModelo("IPad Pro");
        tablet1.setDescripcion("IPad Pro color Gris de 128gb de almacenamiento interno");
        tablet1.setColor("Gris");
        tablet1.setCompania("AT&T");
        tablet1.setNumeroSerie("21288839836");
        tablet1.setTipoInterfazCarga("Lightning");
        tablet1.setPrecio(20999.0); 
        
        // Generamos una tablet con el segundo consstructor 
        Tablet tablet2 = new Tablet("Apple", "IPad air", 12199.0, "IPad air de 64gb color plateado", "plateado", "3389794610", "Lightning", "Telcel"); 
        
//        System.out.println(tablet2.toString());
        
        
        // Generamos un wearable con el primer constructor 
        Wearable wearable1 = new Wearable(); 
        wearable1.setMarca("Apple");
        wearable1.setModelo("Watch series 5");
        wearable1.setColor("Oro");
        wearable1.setDescripcion("Watch series 5 con pantalla de retina");
        wearable1.setPrecio(9999.0);
        wearable1.setNumeroSerie("88879523155");
        wearable1.setTipoInterfazCarga("Lightning");
        wearable1.setTipoMaterial("Aluminio");
               
        // Generamos un wearable con el segundo constructor 
        Wearable wearable2 = new Wearable("Samsung", "Galaxy Watch Active2", 8999.0, "Galaxy Watch Active 2 (40mm) color oro", "oro", "5596133001", "inalambrica", "Aluminio"); 
        
//        System.out.println(wearable2.toString());
        
        //creamos un cliente con el primer constructor 
        Cliente cliente1 = new Cliente(); 
        cliente1.setNombre("Carlos");
        cliente1.setApellidos("Perez Gonzalez");
        cliente1.setEdad(22);
        cliente1.setDireccion("Vicente Guerrero #4");
        
        // Creamos otro cliente con el segundo constructor 
        Cliente cliente2 = new Cliente("Mario", "Sastre", 20, "independencia #45"); 
        
//        System.out.println(cliente2.toString());
        
        
        //creamos un primer catalogo, el cual contendra un celular, un reloj y una tablet 
        Catalogo catalogo1 = new Catalogo(); 
        catalogo1.agregarProducto(celular1);
        catalogo1.agregarProducto(tablet1);
        catalogo1.agregarProducto(wearable1);
        
//        System.out.println(catalogo1.toString());
        
        
        //creamos un array list con otros tres dispositivos 
        ArrayList<Dispositivo> productos = new ArrayList<>(); 
        productos.add(celular2);
        productos.add(tablet2);
        productos.add(wearable2);
        
        //creamos otro catalogo a partir del array list de dispositivos que se creo
        Catalogo catalogo2 = new Catalogo(productos); 
//        System.out.println(catalogo2.toString());
        
        
        //Ahora creamos una tienda 
        Tienda tienda1 = new Tienda();
        //le asignamos un catalogo a esta tienda de prueba
        tienda1.setCatalogo(catalogo1);
        
        
        //Ahora creamos otra tienda de ejemplo y le asignamos un catalogo desde el constructor 
        Tienda tienda2 = new Tienda(catalogo2); 
       
        //creamos una venta 
        Venta venta1 = new Venta(); 
        venta1.setCliente(cliente1);
        venta1.setDispositivo(tablet1);
        venta1.setCantidad(1);
        
        //generamos la venta y la asignamos al registro de venta de la tienda 
        tienda1.crearVenta(venta1.generarVenta());
        
        
        //creamos otra venta 
        Venta venta2 = new Venta(cliente2, celular2, 2); 
        
        //generamos la venta y la asignamos al regustro de vantas de la segunda tienda
        tienda2.crearVenta(venta2.generarVenta());
        
        System.out.println("-------------------------------");
        tienda2.mostrarCatalogo();
    }
    
}
