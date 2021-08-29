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
public class Trayectoria extends Persona {
    private int id;
    private String comienzo;
    private String Final;

    public Trayectoria(int id, String comienzo, String Final, String nombre, String apellido, int edad, int DPI, int cel, String email, String contra) {
        super(nombre, apellido, edad, DPI, cel, email, contra);
        this.id = id;
        this.comienzo = comienzo;
        this.Final = Final;
    }

    
    public void datosdes(){
        System.out.println("Indique donde se encuentra: "); comienzo = sc.next();
        System.out.println("Indique su Trayectoria: "); Final = sc.next();
    }

    public String getComienzo() {
        return comienzo;
    }

    public void setComienzo(String comienzo) {
        this.comienzo = comienzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }
    
    
}
