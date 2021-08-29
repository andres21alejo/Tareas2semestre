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
public class Usuario extends Persona {
    protected int id;

    public Usuario(int id, String nombre, String apellido, int edad, int DPI, int cel, String email, String contra) {
        super(nombre, apellido, edad, DPI, cel, email, contra);
        this.id = id;
    }

    
    public void datosus(){
        System.out.println("Ingrese su nombre: "); nombre = sc.next();
        System.out.println("Ingrese su apellido: "); apellido = sc.next();
        System.out.println("Ingrese su id: "); id = sc.nextInt();
        System.out.println("Ingrese su contraseña: "); contra = sc.next();
        System.out.println("Ingrese su número telefónico: "); cel = sc.nextInt();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
