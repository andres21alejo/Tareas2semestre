/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @Andres
 */
public class Servicios {
    private String ventaja;
    private String servicios;

    public Servicios( ) {
    }

    public void Servicio (){
        
        System.out.println("Seleccione el servicio que desea: \nUber X (1) \nUber black (2) \nUber Suv (3) \nUber pool (4)");   
    }
    public void X(){
        System.out.println("Un servicio más veloz");
    }
    public void black(){
        System.out.println("Accesorios con pantalla \nAsientos de cuero ");
    }
    public void suv(){
        System.out.println("Más tardado \n2 asientos más");
    }
    public void pool(){
        System.out.println("Menos espacio");
    }
    
    public String getVentaja() {
        return ventaja;
    }

    public void setVentaja(String ventaja) {
        this.ventaja = ventaja;
    }
    
    
}
